package com.javaex.ex02;

//콘솔에서 키보드로 문자를 입력받아 텍스트파일에 저장한다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Ex02 {

	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.text", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		while(true) {
			
			String line = br.readLine();
			if(line.equals("q"))break;
			
			bw.write(line);
			bw.newLine();
			
		}
		bw.close();
		fw.close();
		br.close();
		isr.close();
	}
}
