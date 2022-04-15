package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.TestBean;

@Configuration
public class BeanConfigClass {
	@Bean
	public Person p1() {
		return new Person("kim", 30);
	}
	
	@Bean
	public Person p2() {
		return new Person("yoon", 19);
	}
	
	@Bean 
	public TestBean t1() {
		return new TestBean(p1(), p2());
	}
}