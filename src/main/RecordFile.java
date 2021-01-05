package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RecordFile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("기록할 파일명을 입력하세요.");
		String fileName = in.nextLine();
		
		File file = new File(fileName);
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			System.out.println("문장을 입력하세요. 공백 입력시 종료.");
			
			while(true) {
				String value = in.nextLine();
				bw.write(value);
				bw.newLine();
				
				bw.flush();
				
				if(value.isEmpty()) {
					System.out.println("값이 정상적으로 등록되었습니다.");
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}

		in.close();

	}

}
