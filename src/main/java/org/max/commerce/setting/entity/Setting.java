package org.max.commerce.setting.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.RelationOneToMany;
import com.mybatisflex.annotation.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Table("setting")
public class Setting implements Serializable {

	@Id(keyType = KeyType.Auto)
    private Long id;
    private SettingTypeEnum settingType;
    private String settingName;
    private String stringValue;
    private String longTextValue;
    private Boolean booleanValue;
    private Long numberValue;
    private BigDecimal bigDecimalValue;

    @RelationOneToMany(selfField = "id", targetField = "settingId")
    private List<ExtendSetting> extendSettings;
}
