-- Table: user
CREATE SEQUENCE sys.seq_user_id
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;
CREATE TABLE sys.user
(
    id integer NOT NULL DEFAULT nextval('seq_user_id'::regclass),
    first_name character varying(128) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(128) COLLATE pg_catalog."default" NOT NULL,
    email character varying(128) COLLATE pg_catalog."default" NOT NULL,
    status character varying(20) COLLATE pg_catalog."default",
    create_by integer,
    create_time timestamp without time zone,
    update_by integer,
    update_time timestamp without time zone,
    wechat_id character varying(128) COLLATE pg_catalog."default",
    CONSTRAINT pk_sys_user PRIMARY KEY (id),
    CONSTRAINT sys_user_uni UNIQUE (email) WITH (FILLFACTOR=100)
)