package com.noxjs.oauth2.server.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@ApiModel(value="com.noxjs.oauth2.server.entity.Permission")
@Data
@Table(name = "tb_permission")
public class Permission implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value="null")
    private Long id;

    /**
     * 父权限
     */
    @Column(name = "parent_id")
    @ApiModelProperty(value="父权限")
    private Long parentId;

    /**
     * 权限名称
     */
    @Column(name = "`name`")
    @ApiModelProperty(value="权限名称")
    private String name;

    /**
     * 权限英文名称
     */
    @Column(name = "enname")
    @ApiModelProperty(value="权限英文名称")
    private String enname;

    /**
     * 授权路径
     */
    @Column(name = "url")
    @ApiModelProperty(value="授权路径")
    private String url;

    /**
     * 备注
     */
    @Column(name = "description")
    @ApiModelProperty(value="备注")
    private String description;

    @Column(name = "created")
    @ApiModelProperty(value="null")
    private Date created;

    @Column(name = "updated")
    @ApiModelProperty(value="null")
    private Date updated;

    private static final long serialVersionUID = 1L;
}