package com.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factory.TV;


// container main
// XML 기반 설정
public class XML기반설정 {
	public static void main(String[] args) {
		
		// classpath:applicationContext.xml 는 설정파일
		// 컨테이너 == 어플리케이션컨텍스트
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		
		TV tv = context.getBean(TV.class);
		tv.powerOn();
		tv.volumeUp();
	}
}
