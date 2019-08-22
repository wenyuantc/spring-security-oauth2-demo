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
@ApiModel(value="com.noxjs.oauth2.server.entity.UserRole")
@Data
@Table(name = "tb_user_role")
public class UserRole implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value="null")
    private Long id;

    /**
     * 用户 ID
     */
    @Column(name = "user_id")
    @ApiModelProperty(value="用户 ID")
    private Long userId;

    /**
     * 角色 ID
     */
    @Column(name = "role_id")
    @ApiModelProperty(value="角色 ID")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}