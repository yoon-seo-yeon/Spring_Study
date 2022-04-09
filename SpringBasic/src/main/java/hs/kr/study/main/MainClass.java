package hs.kr.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		//config.xml ������ �о �޸𸮷� �ε��Ͽ� ��ü�� ������ �� container�� ������.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//container�� �ִ� t1 ���� ������ �ͼ� t1�� ����
		TestBean t1 = (TestBean) ctx.getBean("t1"); //����ȯ
		
		//t2 ���� ������ �ͼ� t2�� ����
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.println("t2 : " + t2);
		
		TestBean t3 = ctx.getBean("t2", TestBean.class);
		System.out.println("t3 : " + t3);
		
		//container ����
		ctx.close();
	}
}