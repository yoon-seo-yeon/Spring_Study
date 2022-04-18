package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 xml1 = ctx.getBean(TestBean1.class);
		System.out.println("data3 : " + xml1.getData3());
		System.out.println("data4 : " + xml1.getData4());
		
		System.out.println("--------------------------------------------");
		
		TestBean2 xml2 = ctx.getBean(TestBean2.class);
		System.out.println("data1 : " + xml2.getData1());
		System.out.println("data2 : " + xml2.getData2());
		System.out.println("data3 : " + xml2.getData3());
		System.out.println("data4 : " + xml2.getData4());
		
		ctx.close();
	}
}