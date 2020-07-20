package com.cy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication 注解描述的类为
 * springboot项目的启动类.此类在启动时会:
 * 1)基于配置文件(spring.factories)初始化自动配置对象
 * 2)扫描启动类所在包以子包中的类,检测类上是否有
 * @Component,@Controller,@Service等注解,假如有则
  *  表示这些对象要交给spring框架创建并管理.
 */
@SpringBootApplication
public class CgbSboot01Application {
	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}
}
