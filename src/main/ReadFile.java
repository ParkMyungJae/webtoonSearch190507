package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("ll.txt");
		ArrayList<String> list = new ArrayList<>();
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String rl = br.readLine();
				if(rl == null) {
					break;	
				}
				System.out.println(rl);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("통신 오류");
		}
		
	}
}
