package com.javaex.ex02;

//콘솔에서 키보드로 입력받아 콘솔로 출력해보자

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(ir);
		
		String str = br.readLine();
		
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(ow);
		
		bw.write(str);
		
		br.close();
		bw.close();

	}

}
