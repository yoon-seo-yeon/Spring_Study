package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx2.getBean(TestBean1.class);
		System.out.println("data1 : " + obj1.getData1());
		System.out.println("data2 : " + obj1.getData2());
		
		ctx2.close();
	}
}