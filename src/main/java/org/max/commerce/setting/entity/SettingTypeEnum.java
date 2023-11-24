package org.max.commerce.setting.entity;

import com.mybatisflex.annotation.EnumValue;

public enum SettingTypeEnum {

    STRING("STRING"),
    LONG_TEXT("LONG_TEXT"),
    BOOLEAN("BOOLEAN"),
    NUMBER("NUMBER"),
    BIG_DECIMAL("BIG_DECIMAL");

    @EnumValue
    private String code;

    SettingTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
