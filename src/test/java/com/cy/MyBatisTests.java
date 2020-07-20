package com.cy;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.dao.GoodsDao;

@SpringBootTest
public class MyBatisTests {
  @Autowired
  private SqlSessionFactory sqlSessionFactory;
  @Test
  public void testSSF() {
	  System.out.println("sqlSessionFactory="+sqlSessionFactory);
  }
  @Test
  public void testSqlSession() {
	  SqlSession session=
	  sqlSessionFactory.openSession();
	  GoodsDao dao=
	  session.getMapper(GoodsDao.class);
	  int rows=dao.deleteById(100);
	  System.out.println("rows="+rows);
	  session.commit();
	  session.close();
  }
  
}
