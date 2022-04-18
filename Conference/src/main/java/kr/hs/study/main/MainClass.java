package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 xml1 = ctx.getBean(TestBean1.class);
		System.out.println("xml1 : " + xml1);
		
		TestBean2 xml2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("xml2 : " + xml2);
		
		TestBean3 xml3 = ctx.getBean(TestBean3.class);
		System.out.println("xml3 : " + xml3);
		
		ctx.close();
		
		System.out.println("--------------------------------------------");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		System.out.println("java1 : " + java1);
		
		TestBean2 java2 = ctx2.getBean("t2", TestBean2.class);
		System.out.println("java2 : " + java2);
		
		TestBean2 java3 = ctx2.getBean("t3", TestBean2.class);
		System.out.println("java3 : " + java3);
		
//		TestBean3 java4 = ctx2.getBean(TestBean3.class);
//		System.out.println("java4 : " + java4);
		
		TestBean3 java5 = ctx2.getBean("t4", TestBean3.class);
		System.out.println("java5 : " + java5);
		
		TestBean3 java5_1 = ctx2.getBean("t5", TestBean3.class);
		System.out.println("java5_1 : " + java5_1);
		
		TestBean3 java5_2 = ctx2.getBean("t6", TestBean3.class);
		System.out.println("java5_2 : " + java5_2);
		
		ctx2.close();
	}
}