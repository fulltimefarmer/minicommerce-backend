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
@Table("permission")
public class Permission implements Serializable {

    @Id(keyType = KeyType.Auto)
    private Long id;
    @Column(tenantId = true)
    private Long tenantId;
    private PermissionTypeEnum permissionType;
    private String permissionName;
    private String httpMethod;
    private String uriPattern;
    @Column(onInsertValue = "now()")
    private Date created;
    @Column(onUpdateValue = "now()")
    private Date modified;

    @RelationManyToMany(
            joinTable = "mapping_role_permission",
            selfField = "id", joinSelfColumn = "permission_id",
            targetField = "id", joinTargetColumn = "role_id"
    )
    private List<Role> roles;
}
