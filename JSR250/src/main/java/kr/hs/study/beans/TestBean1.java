package kr.hs.study.beans;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public class TestBean1 {
	@Resource //@Autowired + @Qualifier 
	private DataBean1 data1; //DataBean1Ÿ���� bean�� ������(bean�� �̸� : data1) �ڵ������ض�!
	
	@Resource
	private DataBean2 data2;
	
	public TestBean1() {
		System.out.println("TestBean1�� �⺻������");
	}
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	@PostConstruct 
	public void PostConstruct() {
		System.out.println("PostConstruct");
	}
	
	@PreDestroy 
	public void PreDestroy() {
		System.out.println("PreDestroy");
	}
}