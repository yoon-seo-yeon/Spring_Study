//Spring2의 XmlConfiguration와 비교
package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
		System.out.println("obj1 : " + obj1);
		
		TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
		System.out.println("obj2 : " + obj2);
		
		TestBean1 obj3 = ctx.getBean("java3", TestBean1.class);
		System.out.println("obj3 : " + obj3);
		
//		TestBean2 obj4 = ctx.getBean("java4", TestBean2.class);
//		System.out.println("obj4 : " + obj4);
		
		//똑같은 타입을 가져왔는데 obj5와 obj6의 주소가 다르다
		TestBean2 obj5 = ctx.getBean("test", TestBean2.class);
		System.out.println("obj5 : " + obj5);
		
		TestBean2 obj6 = ctx.getBean("test", TestBean2.class);
		System.out.println("obj6 : " + obj6);
		
		ctx.close();
	}
}