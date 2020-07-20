package com.cy.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheTests {
	  /**
	     @autowired注解
	     1)可以描述属性,方法(set,构造,实例方法)
	     2)告诉spring容器,为属性以及方法参数注入值
	     3)spring容器在属性赋值时,首先会依据属性类型,
	          方法参数类型从容器获取bean对象,假如此类型的
	     bean对象有多个,还会检测属性名,参数名是否与
	          容器中已有的相同类型的bean的名字是否有相同,有
	          则直接注入,没有则抛出异常.\
	    
	    @Qualifier 注解应用说明:
	        配合@Autowired注解为属性或方法参数注入值,基于
	        类型注入指定名字的对象
	   */
	  //@Autowired
	  //@Qualifier("weakCache")
	  private Cache cache;
	  
	  @Autowired
	  public void setCache( @Qualifier("weakCache") Cache cache) {
		this.cache = cache;
	  }
	  
	  @Test
	  public void testCache() {
		  System.out.println("cache="+cache);
	  }
}
