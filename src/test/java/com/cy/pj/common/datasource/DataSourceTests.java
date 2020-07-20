package com.cy.pj.common.datasource;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataSourceTests {
	 @Autowired
	 private DataSource dataSource;
	 @Test
	 public void testDataSource() {
		 System.out.println(dataSource.getClass());
	 }
	 @Test
	 public void testGetConnection()throws Exception {
		 System.out.println(dataSource.getConnection());
	 }
}




