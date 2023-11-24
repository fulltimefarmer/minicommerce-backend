package org.max.commerce.setting.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@Table("extend_setting")
public class ExtendSetting implements Serializable {

    @Id(keyType = KeyType.Auto)
    private Long id;
    private Long settingId;
    private String settingKey;
    private String stringValue;
    private String longTextValue;
    private Boolean booleanValue;
    private Long numberValue;
    private BigDecimal bigDecimalValue;
}
