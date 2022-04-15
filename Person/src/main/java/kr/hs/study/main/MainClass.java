package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean obj1 = ctx.getBean(TestBean.class);
		System.out.println(obj1.getP1() + ", " + obj1.getP2());
		
		TestBean obj2 = ctx.getBean(TestBean.class);
		System.out.println(obj2.getP1() + ", " + obj2.getP2());
		
		ctx.close();
	}
}