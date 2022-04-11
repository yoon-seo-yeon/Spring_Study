package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean obj1 = ctx.getBean("t1", TestBean.class);
		System.out.println("data1 : " + obj1.getData1());
		System.out.println("data2 : " + obj1.getData2());
		System.out.println("data3 : " + obj1.isData3());
		System.out.println("data4 : " + obj1.getData4());
		
		System.out.println("=========================");
		
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data5 : " + obj2.getData5());
		System.out.println("data6 : " + obj2.getData6());
		System.out.println("data7 : " + obj2.getData7());
	}
}
