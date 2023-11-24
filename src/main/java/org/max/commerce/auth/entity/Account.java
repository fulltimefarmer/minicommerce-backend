package org.max.commerce.auth.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.RelationManyToMany;
import com.mybatisflex.annotation.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@Table("account")
public class Account implements Serializable {

    @Id(keyType = KeyType.Auto)
    private Long id;
    @Column(isLogicDelete = true)
    private Boolean isDelete;
    @Column(tenantId = true)
    private Long tenantId;
    private AccountTypeEnum accountType;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String displayName;
    private String remark;
    @Column(onInsertValue = "now()")
    private Date created;
    @Column(onUpdateValue = "now()")
    private Date modified;

    @RelationManyToMany(
            joinTable = "mapping_role_account",
            selfField = "id", joinSelfColumn = "account_id",
            targetField = "id", joinTargetColumn = "role_id"
    )
    private List<Role> roles;
}
