package com.noxjs.oauth2.server.mapper;

import com.noxjs.oauth2.server.entity.Permission;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @description:
 * @author: Nox
 * @date: 2019-08-22
 */
public class PermissionMapperTest {
	private static PermissionMapper mapper;

	@BeforeClass
	public static void setUpMybatisDatabase() {
		SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(PermissionMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/PermissionMapperTestConfiguration.xml"));
		//you can use builder.openSession(false) to not commit to database
		mapper = builder.getConfiguration().getMapper(PermissionMapper.class, builder.openSession(true));
	}

	@Test
	public void testFindOneById() throws FileNotFoundException {
		Permission oneById = mapper.findOneById(1L);
		System.out.println("oneById = " + oneById);
	}

	@Test
	public void testFindOneByParentId() throws FileNotFoundException {
		mapper.findOneByParentId(2L);
	}
}
