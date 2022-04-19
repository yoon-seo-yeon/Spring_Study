package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 호출");
	}
	
	public void method1(int a) {
		System.out.println("int 매개변수 method1 호출");
	}
	
	public void method1(String s) {
		System.out.println("String 매개변수 method1 호출");
	}
	
	public void method1(int a, int b) {
		System.out.println("int 매개변수 2개 method1 호출");
	}
	
	public void method1(int a, String s) {
		System.out.println("int 매개변수, String 매개변수 method1 호출");
	}
	
	public void method2() {
		System.out.println("method2 호출");
	}
}