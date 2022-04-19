package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		obj1.method1();
		obj1.method1(100);
		obj1.method1("spring100");
		obj1.method1(100, 200);
		obj1.method1(300, "spring300");
		obj1.method2();
		
		System.out.println("-------------------------------------");
		
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		obj2.method1();
		
		System.out.println("-------------------------------------");
		
		TestBean3 obj3 = ctx.getBean("t3", TestBean3.class);
		obj3.method1();
		
		ctx.close();
	}
}