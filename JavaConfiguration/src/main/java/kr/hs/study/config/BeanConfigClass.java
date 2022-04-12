package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

//�ڹٷ� ��ü�� �����϶�� �ϴ� ����������
@Configuration
public class BeanConfigClass {
	//�ؿ��� xml ���
	//<bean id = "t1" class = "kr.hs.study.beans.TestBean1"/>
	
	//�ڹ� ���
	@Bean	//�Ʒ� ������ �޼��带 �����ؼ� TestBean1��ü�� ����ž�
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean1 java3() {
		return new TestBean1();
	}
	
	@Bean(name = "test")
	@Lazy
	@Scope("prototype")
	public TestBean2 java4() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
}