package com.test.spring.springorm.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

//import com.test.spring.springjdbc.dto.EmployeeDao;
//import com.test.spring.springjdbc.dto.EmployeeDto;

public class Test {

	public static void main(String[] args) {
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext("config.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/test/spring/springorm/entity/config.xml");

		//JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbctemplate");
		/*String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, 1, "Java", "Training");
		System.out.println("number of records inserted " + result);*/

		ProductDao dao = (ProductDao) ctx.getBean("productDao");
		Product prod = new Product();
		dao.create(prod);
		prod.setId(1);
		prod.setName("phone");
		prod.setDesc("its fine");
		prod.setPrice(300);
		dao.create(prod);

		
		
	
		

	}

}
