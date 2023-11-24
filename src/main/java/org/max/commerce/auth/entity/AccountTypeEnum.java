package org.max.commerce.auth.entity;

import com.mybatisflex.annotation.EnumValue;

import java.io.Serializable;

public enum AccountTypeEnum implements Serializable {

    ADMIN(1, "ADMIN"),
    INTERNAL(2, "INTERNAL"),
    EXTERNAL(3, "EXTERNAL");

    @EnumValue
    private int code;
    private String desc;

    AccountTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
