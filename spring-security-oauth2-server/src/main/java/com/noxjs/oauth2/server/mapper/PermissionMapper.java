package com.noxjs.oauth2.server.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.noxjs.oauth2.server.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Mapper
public interface PermissionMapper extends tk.mybatis.mapper.common.Mapper<Permission> {

	Permission findOneById(@Param("id")Long id);


	Permission findOneByParentId(@Param("parentId")Long parentId);


	List<Permission> selectByUserId(@Param("userId") Long userId);




}
