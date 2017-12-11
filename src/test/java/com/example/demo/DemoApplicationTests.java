package com.example.demo;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.freeive.chaos.admin.Application;
import com.freeive.chaos.admin.TestMapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Application.class)
public class DemoApplicationTests {


	@Autowired
	DataSource ds;

	@Autowired
	private SqlSessionFactory sqlSession;
	

	@Autowired
	private TestMapper mapper;


	@Test
	public void connectionTest() throws Exception {
		System.out.println("ds : "+ds);
        Connection con = ds.getConnection(); //ds(DataSource)에서 Connection을 얻어내고
        System.out.println("con : "+con); //확인 후
        con.close(); //close

	}

	@Test
	public void sessionTest() {
		System.out.println("sqlSession : "+sqlSession);
	}


	@Test
	public void mapperTest() throws Exception {

		Map<String, Object> map = null;
		map.put("ddd", "fff");
		System.out.println(map);
	}

}
