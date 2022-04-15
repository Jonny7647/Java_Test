package day12;

import java.util.HashMap;
import java.util.Scanner;

/*  HashMap
	id와 tel(전화번호)로 구성된 Student클래스를 만들고, 
	이름을 key로하고 Student 객체를 값으로 하는 HashMap을 작성해보세요. 
	5명 정도 HashMap에 미리 저장해놓고,  
	이름을 검색하면 id와 전화번호 출력되며, exit를 입력하면 프로그램 종료. 
*/
class Student {
	private String id;
	private String tel;
	Student (String id, String tel){
		this.id = id;
		this.tel = tel;
	} 	// 생성자 만들고~
	public String getId() { return id; }
	public String getTel() { return tel; }	
}

public class CollEx01 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	
	HashMap <String, Student> map = new HashMap<String, Student>();

	
	map.put("고길동", new Student("Gogildong", "000-0000-0000"));
	map.put("희동이", new Student("heudong"  , "111-1111-1111"));
	map.put("둘리"  , new Student("Dool-ri"  , "222-2222-2222"));
	map.put("또치"  , new Student("Ddochi"   , "333-3333-3333"));
	map.put("도우너", new Student("Dounou"   , "444-4444-4444"));
	
	while(true) {
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		if(name.equals("exit")) {
			System.out.println("프로그램 종료!");
			break;
		} 
		
		Student s  = map.get(name);
		if(s == null) { 
			System.out.println("찾는 이름이 없습니다");
		}else {
			System.out.println("id : " + s.getId() + ", 전화 : " + s.getTel());
		}
	}
		
		
	sc.close();
	}
}
