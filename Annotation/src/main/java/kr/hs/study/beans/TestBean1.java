package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	// @Autowired, @Qualifier("test") 사용
	//객체 만들기
	//data1, data2 값 출력
	
	@Autowired
	private DataBean1 data1;
	
	@Autowired
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
}