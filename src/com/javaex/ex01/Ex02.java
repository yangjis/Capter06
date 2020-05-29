package com.javaex.ex01;

//데이터통신. BufferedStream을 이용하여 데이터를 전송해보자

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\buffStream.jpg");
		
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사시작");
		while(true) {
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사완료");
				break;
			}
			bout.write(data);
		}
		
		in.close();
		out.close();

	}
}
