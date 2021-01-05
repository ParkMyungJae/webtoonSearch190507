package model;

public class Book {
	
		private String name;
		private String author;
		private int num;
		private String date;
		private String text;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
		public Book() {
			this.name = "아이폰이란";
			this.author = "박명재";
			this.num = 1101;
			this.date = "2019년 05월 07일";
			this.text = "스티브 잡스가 애플을 발전시킴";
		}
		
		
		public Book(String title, String author, 
				int number, String pubDate, String description) {
			this.name = name;
			this.author = author;
			this.num = num;
			this.date = date;
			this.text = text;
		}

		@Override
		public String toString() {
			return "책 제목: " + name + " 지은이 : " + author + " 도서 번호 : " + num + " 날짜: " + date + " 책소개글 : " + text;
		}
		
		

}
