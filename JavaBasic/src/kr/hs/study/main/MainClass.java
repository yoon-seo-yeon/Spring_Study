package kr.hs.study.main;

import kr.hs.study.Hello;
import kr.hs.study.HelloworldEn;
import kr.hs.study.HelloworldKo;

public class MainClass {
	public static void main(String[] args) {
		Hello hello = new HelloworldEn(); //������ ����
		//HelloworldEn hello = new HelloworldEn(); Ÿ��Ʈ�� ����
		say_Method(hello);
	}
	
	public static void say_Method(Hello hello) {
		hello.sayHello();
	}
}