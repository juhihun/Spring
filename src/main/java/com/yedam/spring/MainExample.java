package com.yedam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExample {
	public static void main(String[] args) {
		//컨테이너생성
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//beans의 id값으로 호출
		TV tv = (TV) ctx.getBean("tv");
		tv.turnOn();
		
		
		//싱글톤 TV class 속성 호출
		TV subTv = (TV) ctx.getBean(TV.class);
		subTv.turnOn();
		
		if( tv == subTv ) {
			System.out.println("같은 인스턴스입니다");
		}else {
			System.out.println("다른 인스턴스입니다.");
		}
	}
}
