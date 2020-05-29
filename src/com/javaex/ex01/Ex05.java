package com.javaex.ex01;

//UTF-8형식이 아닌 다른 형식의 텍스트 파일을 콘솔창에 출력해보자

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		InputStreamReader ir = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(ir);
		
		while(true) {
			
			String str = br.readLine();
			if(str == null) break;
			
			System.out.println(str);
			
		}
		
		
		
		
		
		in.close();
	}
}
