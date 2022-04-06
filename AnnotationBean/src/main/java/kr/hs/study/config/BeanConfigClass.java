package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;

@Configuration
public class BeanConfigClass {
	@Bean(name="d1")
	public DataBean1 java1() {
		return new DataBean1();
	}
	
	@Bean(name="d2")
	public DataBean2 java2() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
}