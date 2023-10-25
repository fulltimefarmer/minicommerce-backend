#!/bin/sh

project_path=$(pwd)
project_name="${project_path##*/}"

echo $project_name

seconds=1
until docker container exec -it $project_name-mysql-1 mysqladmin ping -P 3306 -uroot -p1q2w3e4r | grep "mysqld is alive" ; do
  >&2 echo "MySQL is starting, already wait for $seconds seconds..."
  sleep 1
  seconds=$(expr $seconds + 1)
done
>&2 echo "MySQL is almost ready, continue wait for 3 seconds..."
sleep 3
