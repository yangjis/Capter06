package com.javaex.ex01;

//데이터통신. BufferedWriter를 이용하여 외부에 글을 남기자.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.text");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡떙떙");
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다.");
		
		bw.close();
	}
}
