package com.cy.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class DefaultCacheTests {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private DefaultCache defaultCache;
	
	@Test
	public void testGetCacheBean() {
		DefaultCache cache01=
		applicationContext.getBean(DefaultCache.class);
		DefaultCache cache02=
		applicationContext
		.getBean("defaultCache",DefaultCache.class);
		System.out.println(cache01==cache02);
		
	}
	@Test
	public void testDefaultCache() {
		System.out.println("defaultCache="+defaultCache);
	}
}
