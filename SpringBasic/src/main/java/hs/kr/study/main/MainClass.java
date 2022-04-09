package hs.kr.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		//config.xml 파일을 읽어서 메모리로 로딩하여 객체를 생성한 후 container에 보낸다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//container에 있는 t1 빈을 가지고 와서 t1에 넣음
		TestBean t1 = (TestBean) ctx.getBean("t1"); //형변환
		
		//t2 빈을 가지고 와서 t2에 넣음
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.println("t2 : " + t2);
		
		TestBean t3 = ctx.getBean("t2", TestBean.class);
		System.out.println("t3 : " + t3);
		
		//container 종료
		ctx.close();
	}
}