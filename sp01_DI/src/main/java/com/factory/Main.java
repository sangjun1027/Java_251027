package com.factory;

// test class

// main method의 매개변수는 다른말로 '명령행 인수'
// ex) c:\> copy src tr => c:\> Main Samsung

public class Main {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		//상속과 다형성 - 부모타입의 참조변수가 자식객체를 할 수 있다
		TV tv = (TV)factory.getBean(args[0]);
		
		tv.powerOn();	// 다형성 - 참조하는 객체의 메서드(오버라이딩 된)를 호출
		tv.volumeUp();	// 
		
	}

}
