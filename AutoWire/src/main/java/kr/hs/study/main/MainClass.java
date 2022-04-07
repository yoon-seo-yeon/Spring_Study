package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("data1 : " + obj1.getData1());
		System.out.println("data2 : " + obj1.getData2());
		System.out.println("data3 : " + obj1.getData3());
		
		System.out.println("=============================================");
		
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data4 : " + obj2.getData4());
		System.out.println("data5 : " + obj2.getData5());
		
		System.out.println("=============================================");
		TestBean3 obj3 = ctx.getBean("t3", TestBean3.class);
		obj3.prData();
		
		ctx.close();
	}
}