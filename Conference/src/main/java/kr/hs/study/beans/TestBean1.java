package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component //("t1") //�̸��� ���ٸ� <bean class = "kr.hs.study.beans.TestBean1"/>�̰ſ� ����
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1�� �⺻������");
	}
}