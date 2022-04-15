package day07;


class Book2 {
	
	String title;
	String author;
	
	Book2() {
		this("무제", "작자미상");
		System.out.println("생성자1");
	}
	
	Book2(String title) {
		//this.title = title;
		//this.author = "작자미상";
		// #3. 
		// 항상 생성자안에서 첫번째 명령이여야함
		this(title, "작자미상");	// 매개변수 2개 있는 생성자 호출
		// #5.
		System.out.println("생성자2");
	}
	
	Book2(String title, String author) {
		// #4. 
		System.out.println("생성자3");
		this.title = title;
		this.author = author;
	}
	void show() {
		System.out.println(title + " " + author);
	}
	
}
public class Test79 {

	public static void main(String[] args) {
		// #1. 메인메서드 실행
		// #2.  객체생성
		Book2 little = new Book2("어린왕자", "생택쥐베리");
		Book2 kong = new Book2("콩쥐팥쥐");
		// #6.  
		little.show();
		kong.show();
		/*
		Book2 untitled = new Book2();  // 무제의 작자미상
		untitled.show();*/
	}

}
