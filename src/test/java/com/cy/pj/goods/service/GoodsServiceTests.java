package com.cy.pj.goods.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GoodsServiceTests {
	
	   @Autowired
	   private GoodsService goodsService;
	   @Test
	   public void deleteObjects() {
		   int rows=goodsService.deleteObjects(1,2,3);
		   System.out.println("delete.rows="+rows);
	   }
	   
}
