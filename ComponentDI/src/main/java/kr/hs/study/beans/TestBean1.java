package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	//@Autowired ����ؼ� data3, 4 ���
	
	@Autowired
	private DataBean3 data3;
	
	@Autowired
	private DataBean4 data4;

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
}