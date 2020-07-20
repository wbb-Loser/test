package com.cy.pj.common.util;
import java.lang.annotation.Annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.cy.pj.common.cache.DefaultCache;
/**
   * 通过如下类理解spring框架中判定类上是否有指定注解的过程
 * 1)底层实现:反射技术
 * 
 */
public class AnnotationUtil {
	static Class<?>[] array= {
		 Component.class,Controller.class
	};
	/**判定类上是否有指定的注解*/
	@SuppressWarnings("unchecked")
	public static boolean isAnnotation(Class<?> cls) {
		 for( @SuppressWarnings("rawtypes")Class annoCls:array) {
			 Annotation anno=cls.getAnnotation(annoCls);
			 if(anno!=null)return true;
		 }
		 return false;
	}
	public static void main(String[] args) {
		boolean flag=isAnnotation(DefaultCache.class);
		System.out.println("flag="+flag);
	}
}
