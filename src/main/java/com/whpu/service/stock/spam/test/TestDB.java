package com.whpu.service.stock.spam.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.whpu.service.stock.spam.pojo.UserTest;

public class TestDB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource = "map/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
				.build(reader);
		session = sqlMapper.openSession();
		UserTest temp = session.selectOne("findById", 1);
		System.out.println(temp.getName());
		session.close();
	}
}
