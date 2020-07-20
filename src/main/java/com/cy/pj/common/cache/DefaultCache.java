package com.cy.pj.common.cache;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @Component 注解描述的类为一个spring框架管理的对象
 * @Lazy 注解描述类时,表示此类在容器启动时不创建其实例
  *   对象,这种特性称为延迟加载.但是此特性只对特定作用域的
  *   对象起作用(例如单例作用域).
   @Scope 注解用于定义对象的作用域?(singleton,prototype,....)
   1)singleton 保证类的实例在内存中只有一份.
   2)prototype 此作用域表示这个类的实例需要时创建,并且
          每次从容器都会创建一个新的实例.
 */
@Scope("singleton")
@Lazy(true)
@Component
public class DefaultCache implements Cache{
	public DefaultCache() {
		System.out.println("DefaultCache()");
	}
	/**@PostConstruct 为对象生命周期初始化方法*/
	@PostConstruct
	public void init() {//生命周期方法
		System.out.println("init()");
	}
	/**@PreDestroy 描述的方法,可以在对象销毁前执行.*/
	@PreDestroy
	public void destory() {
		System.out.println("destory()");
	}
}





