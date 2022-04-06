package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("data1 : " + t1.getData1());
		System.out.println("data2 : " + t1.getData2());
	
		System.out.println("===========================================");
		
		TestBean2 t2 = ctx.getBean("xml1", TestBean2.class);
		System.out.println("data1 : " + t2.getData1());
		System.out.println("data2 : " + t2.getData2());
		
		System.out.println("===========================================");

		TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
		System.out.println("data1 : " + t3.getData1());
		System.out.println("data2 : " + t3.getData2());
		System.out.println("data3 : " + t3.getData3());
		System.out.println("data4 : " + t3.getData4());
		
		ctx.close();
		
		System.out.println("===========================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean2 obj3 = ctx2.getBean("java3", TestBean2.class);
		System.out.println("data1 : " + obj3.getData1());
		System.out.println("data2 : " + obj3.getData2());
		
		ctx2.close();
	}
}