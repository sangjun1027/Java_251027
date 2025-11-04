package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.factory.TV;

// test용 class
// java 기반 설정

public class 자바기반설정 {

		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context 
			= new AnnotationConfigApplicationContext(ApplicationContext.class);

			TV tv = (TV)context.getBean("tv");
			tv.powerOn();
			tv.volumeUp();
			
		} // end of main
} // end of class
