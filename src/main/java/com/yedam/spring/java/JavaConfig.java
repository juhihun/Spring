package com.yedam.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	//설정파일
	
	//Bean 등록 -> 메소드 활용(메소드 실행 결과 리턴)
	@Bean
	public Chef chef() {
		return new Chef();
	}
	@Bean
	public Restaurant restaurant(Chef chef) {
		Restaurant res = new Restaurant();
		res.setChef(chef);
		return res;
	}
	
}