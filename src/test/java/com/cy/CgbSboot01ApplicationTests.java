package com.cy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
/**
 * @SpringBootTest 注解描述类表示是由spring容器
  *   管理的一个测试类对象
 */
@SpringBootTest
class CgbSboot01ApplicationTests {
	@Autowired
	private BeanFactory beanFactory;
	@Autowired
	private ApplicationContext ctx;
	@Test
	public void testBeanFactory() {
		System.out.println("testBeanFactory()");
		System.out.println("beanFactory="+
		beanFactory.getClass());//DefaultListableBeanFactory
	}
	@Test
	public void testCtx() {
		System.out.println("ctx="+ctx.getClass());
	}
}
