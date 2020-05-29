package com.javaex.ex01;

//데이터 통신. inputStream, outputStream을 사용해보자.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\buff.jpg");
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사 시작");
		while(true) {
			int data = in.read(buff);
			
			if(data == -1) {
				System.out.println("복사 완료" + data);
				break;	
			}
			
			out.write(buff);
		}
		
		out.close();
		in.close();
	}
}
