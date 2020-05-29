package test;

//ArrayList에서 한줄에 초기화하는 방법.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		//1단계================================================================
		List<Student> aList = new ArrayList<Student>();
		Student s1 = new Student("고양이키우고싶다", 99999);
		aList.add(s1);
		
		for(Student s : aList) System.out.println(s);
		
		//2단계===============================================================
		String[] name = {"홍길동", "양지선"};
		int[] age = {90, 100};
		
		List<Student> list = Arrays.asList(
				new Student(name[0], age[0]),
				new Student("양지선", 100)
		);
//		list.add(new Student("조지원",2));
		
		for(Student s : list) System.out.println(s);
		
		//3단계==============================================================
		List<Student> sList = new ArrayList<Student>(
				Arrays.asList(new Student("조지원",2),
								new Student("KIDDO",987),
								new Student("성시경",40)
			));
		
		System.out.println("-----------------라스트 끝!-------------------------------");
		for(Student s : sList) System.out.println(s);

	}
}
