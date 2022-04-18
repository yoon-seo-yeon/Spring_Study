package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans", "kr.hs.study.bean2"})
public class BeanConfigClass {
	@Bean
	public TestBean2 t3(){
		return new TestBean2();
	}
	
	@Bean
	public TestBean3 t4() {
		return new TestBean3();
	}
	

	@Bean
	public TestBean3 t5() {
		return new TestBean3();
	}
	

	@Bean
	public TestBean3 t6() {
		return new TestBean3();
	}
}