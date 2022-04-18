package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component //("t1") //이름이 없다면 <bean class = "kr.hs.study.beans.TestBean1"/>이거와 같다
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
}