package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.BeanConfigClass;
import kr.hs.study.beans.TestBean;
import kr.hs.study.dao.TestDAO;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		//TestDAO 가져오기
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		//TestBean객체 bean1 만들어서 100, spring100넣기
//		TestBean bean1 = new TestBean();
//		bean1.setData1(100);
//		bean1.setData2("spring100");
		
		//TestBean객체 bean2 만들어서 200, spring200넣기
//		TestBean bean2 = new TestBean();
//		bean2.setData1(200);
//		bean2.setData2("spring200");
		
		//insert_data 호출
		//dao.insert_data(bean1);
		//dao.insert_data(bean2);
		
		//update
//		TestBean bean3 = new TestBean();
//		bean3.setData1(100);
//		bean3.setData2("testtest");
//		dao.update_data(bean3);
		
		//delete
		TestBean bean4 = new TestBean();
		bean4.setData1(100);
		dao.delete_data(bean4);
		
		System.out.println("Deleted!!");
		
		ctx.close();
	}
}