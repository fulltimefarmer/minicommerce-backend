package org.max.commerce.auth.entity;

import com.mybatisflex.annotation.EnumValue;

public enum PermissionTypeEnum {

    PLAIN_TEXT("PLAIN_TEXT"),
    HTTP_URI("HTTP_URI");

    @EnumValue
    private String code;

    PermissionTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
