package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 ȣ��");
	}
	
	public void method1(int a) {
		System.out.println("int �Ű����� method1 ȣ��");
	}
	
	public void method1(String s) {
		System.out.println("String �Ű����� method1 ȣ��");
	}
	
	public void method1(int a, int b) {
		System.out.println("int �Ű����� 2�� method1 ȣ��");
	}
	
	public void method1(int a, String s) {
		System.out.println("int �Ű�����, String �Ű����� method1 ȣ��");
	}
	
	public void method2() {
		System.out.println("method2 ȣ��");
	}
}