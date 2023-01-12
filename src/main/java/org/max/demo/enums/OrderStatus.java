package org.max.demo.enums;

import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {

	PENDING,
	OPEN,
	SHIPPED,
	COMPLETED,
	CANCELLED;
	
	public static OrderStatus getByName(String name) {
		if(StringUtils.isNotBlank(name)) {
			for (OrderStatus orderStatus : OrderStatus.values()) {
				if(orderStatus.name().equals(name.toUpperCase())) {
					return orderStatus;
				}
			}
		}
		return null;
	}
	
}
