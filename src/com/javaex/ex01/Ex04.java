package com.javaex.ex01;

//데이터통신. Reader, BufferedReader를 사용하여 외부의 데이터를 읽어오자.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args)throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.text");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			
			System.out.println(str);
		}
		
		br.close();
		
	}
}
