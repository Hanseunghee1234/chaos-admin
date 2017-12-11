package com.freeive.chaos.admin;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
@MapperScan(value = {"com.freeive.chaos"})
public class Application {

	@RequestMapping("/")
	String home() {
		return "index";
	}


	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(dataSource);
			
			Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*mapper.xml");
            sessionFactory.setMapperLocations(res);

            return sessionFactory.getObject();
    }



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
