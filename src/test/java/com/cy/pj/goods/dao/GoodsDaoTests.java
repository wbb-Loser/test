package com.cy.pj.goods.dao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/**
* 快捷键:
*1)ctrl+shift+o  快速导包
*2)alt+/ 提示
*3)ctrl+shift+t 打开查找类的窗口
*4)ctrl+t 查看类的继承体系
*5)ctrl+o 查看类中的方法(可以连续ctrl+o)
*6).............
*/
@SpringBootTest
public class GoodsDaoTests {
	@Autowired
    private GoodsDao goodsDao;
	@Test
    public void testDeleteById() {
		System.out.println(goodsDao.getClass().getName());
    	int rows=goodsDao.deleteById(3);
    	System.out.println("rows="+rows);
    }
	
	@Test
	public void testDeleteObjects() {
		int rows=goodsDao.deleteObjects(1,2);
		System.out.println("rows="+rows);
	}
	
	
}





