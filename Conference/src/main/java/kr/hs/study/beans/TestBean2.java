package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component("t2")
//@Component("t3") <- �ߺ� �̸��� �ȵȴٸ� @Bean����
public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2�� �⺻������");
	}
}
