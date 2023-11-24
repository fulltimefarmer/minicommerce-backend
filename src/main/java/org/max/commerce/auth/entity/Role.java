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
@Table("role")
public class Role implements Serializable {

    @Id(keyType = KeyType.Auto)
    private Long id;
    @Column(tenantId = true)
    private Long tenantId;
    private String roleName;
    @Column(onInsertValue = "now()")
    private Date created;
    @Column(onUpdateValue = "now()")
    private Date modified;

    @RelationManyToMany(
            joinTable = "mapping_role_account",
            selfField = "id", joinSelfColumn = "role_id",
            targetField = "id", joinTargetColumn = "account_id"
    )
    private List<Account> accounts;
    @RelationManyToMany(
            joinTable = "mapping_role_permission",
            selfField = "id", joinSelfColumn = "role_id",
            targetField = "id", joinTargetColumn = "permission_id"
    )
    private List<Permission> permissions;
}
