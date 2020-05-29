package com.javaex.ex02;

//1.텍스트 파일을 입력받아 원하는 형식으로 콘솔창에 출력하자.
//2.내 이름,폰번호,회사번호를 입력해보자.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) break; 
			
			String[] data = str.split(",");
			
			String name = data[0];
			String hp = data[1];
			String company = data[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println();
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt", true));
		
		bw.write("양지선,010-2382-3636,02-8028-1176");
		
		bw.close();
		fr.close();

	}
}
