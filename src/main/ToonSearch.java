package main;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import model.Toon;

public class ToonSearch {
	public static void main(String[] args) {
		String url = "https://comic.naver.com/webtoon/weekday.nhn";
		
		ArrayList<Toon> toonList = new ArrayList<>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			
			Elements list = doc.select(".list_area .col_inner li > a");
			
			for(Element item : list) {
				String href = item.attr("href");
				int start = href.indexOf("titleId=");
				int end = href.indexOf("&");
				String id = href.substring(start + 8, end);
				String name = item.text();
				
				Toon toon = new Toon(name, id);
				toonList.add(toon);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("검색하고자 하는 웹툰을 입력하세요");
		String name = in.nextLine();
		
		for(Toon toon : toonList) {
			if(toon.checkContain(name)) {
				System.out.println(toon);
			}
		}
	}
}
