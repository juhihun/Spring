package com.yedam.spring.java;

public class Restaurant {
	//chef에 소속
	private Chef chef;
	
	Restaurant(Chef chef){
		System.out.println("생성자 인젝션");
		this.chef = chef;
	}
	
	Restaurant(){}
	public void setChef(Chef chef) {
		System.out.println("세터 인젝션");
		this.chef = chef;
	}
	
	//실행
	public void run() {
		chef.cooking();
	}
}
