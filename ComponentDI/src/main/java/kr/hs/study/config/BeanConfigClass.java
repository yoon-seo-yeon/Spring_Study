package kr.hs.study.config;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;

public class BeanConfigClass {
	public DataBean3 d1() {
		return new DataBean3();
	}
	
	public DataBean4 d4() {
		return new DataBean4();
	}
	
	public TestBean1 t1() {
		return new TestBean1();
	}
}