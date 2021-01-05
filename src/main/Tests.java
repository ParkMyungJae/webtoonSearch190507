package main;

import model.Book;

public class Tests {

	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println(book1);
		
		Book book2 = new Book("아이폰 너무 좋아용", "박명재", 1101, "2019년 05월 07일", "스티브잡스때가 더 좋아");
		System.out.println(book2);

	}

}
