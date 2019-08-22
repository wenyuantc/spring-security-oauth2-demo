package com.noxjs.oauth2.server.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@ApiModel(value="com.noxjs.oauth2.server.entity.RolePermission")
@Data
@Table(name = "tb_role_permission")
public class RolePermission implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value="null")
    private Long id;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    @ApiModelProperty(value="角色 ID")
    private Long roleId;

    /**
     * 权限 ID
     */
    @Column(name = "permission_id")
    @ApiModelProperty(value="权限 ID")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}