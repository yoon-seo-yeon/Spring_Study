package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfig {
	@Bean
	public DataBean1 java1() {
		return new DataBean1();
		/*
		DataBean1 d1 = new DataBean1();
		return d1;
		*/
	}
	
	@Bean
	public DataBean2 java2() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean1 java3() {
		return new TestBean1();
	}
}
