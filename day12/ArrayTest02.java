package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

		
	// 영어이름을 4개 입력받아 ArrayList에  저장하고
	// 모든데이터에 직접 접근해 출력한 후 제일 긴 이름을 출력하세요
		
		
	Scanner sc = new Scanner(System.in);
	ArrayList<String> strArr = new ArrayList<String>();
	
	
	for(int i = 0; i < 4;  i++) {
		System.out.println("영어이름을 입력하세요");
		String s = sc.nextLine();
		strArr.add(s);
	}

	for(int i = 0; i < strArr.size();  i++) {	// length가 아닌 size()
		System.out.println(strArr.get(i));
	}
	
	// 최대값 찾기
	int longestIdx = 0;
	for(int i = 0; i < strArr.size();  i++) {
		if(strArr.get(longestIdx).length() < strArr.get(i).length()) {
			longestIdx = i;
		}
	}
	System.out.println("가장 긴 이름은 : " + strArr.get(longestIdx));
	sc.close();
	}

}
