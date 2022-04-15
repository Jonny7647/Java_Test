package day12;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점(학점단위 : 'A','B','C','D','F')을 문자로 입력받아
	ArrayList에 저장하고 ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 
	평균을 출력하는 프로그램을 작성하세요. 
	콘솔예:
		6개의 학점을 띄어쓰기하여 입력하세요(A/B/C/D/F) >> A C A B F D  (사용자 입력)
		평균 : 2.333333333
		
*/
public class CollEx03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> strArr = new ArrayList<String>();
		
		strArr.add("A");
		strArr.add("B");
		strArr.add("C");
		strArr.add("D");
		strArr.add("F");
		
		//System.out.println(strArr);
		/*
		 double prev = strArr.set(0, 4.0);	// 변경전 기본에 저장되있던 값 리턴
		 double prev = strArr.set(1, 3.0);	// 변경전 기본에 저장되있던 값 리턴
		 double prev = strArr.set(2, 2.0);	// 변경전 기본에 저장되있던 값 리턴
		 double prev = strArr.set(3, 1.0);	// 변경전 기본에 저장되있던 값 리턴
		 double prev = strArr.set(4, 0.0);	// 변경전 기본에 저장되있던 값 리턴
		 
		 System.out.println(strArr);
		 System.out.println(prev);
		*/
		for(int i = 0; i < strArr.size();  i++) {
			
		}

		
		
		sc.close();
	
	}
}
