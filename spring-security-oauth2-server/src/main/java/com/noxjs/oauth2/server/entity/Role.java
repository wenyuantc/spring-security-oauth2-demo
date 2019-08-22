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
@ApiModel(value="com.noxjs.oauth2.server.entity.Role")
@Data
@Table(name = "tb_role")
public class Role implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty(value="null")
    private Long id;

    /**
     * 父角色
     */
    @Column(name = "parent_id")
    @ApiModelProperty(value="父角色")
    private Long parentId;

    /**
     * 角色名称
     */
    @Column(name = "`name`")
    @ApiModelProperty(value="角色名称")
    private String name;

    /**
     * 角色英文名称
     */
    @Column(name = "enname")
    @ApiModelProperty(value="角色英文名称")
    private String enname;

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