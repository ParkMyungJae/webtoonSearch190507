package main;

import model.Human;

public class Test {

	public static void main(String[] args) {
		Human h = new Human(); // 생성자
		
		Human h2 = new Human("Gondr99", 99);
		
		System.out.println(h);
	}

}
