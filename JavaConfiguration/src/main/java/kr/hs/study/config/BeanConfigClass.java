package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

//자바로 객체를 생성하라고 하는 설정파일임
@Configuration
public class BeanConfigClass {
	//밑에껀 xml 방식
	//<bean id = "t1" class = "kr.hs.study.beans.TestBean1"/>
	
	//자바 방식
	@Bean	//아래 나오는 메서드를 실행해서 TestBean1객체를 만들거야
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