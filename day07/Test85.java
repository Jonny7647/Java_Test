package day07;
/*
	main() 메서드를 실행하였을때 예시와 같이 출력되도록 Tv클래스를 작성하세요. 
	콘솔출력예 >> LG에서 만든 2022년형 45인치 TV
*/

class Tv {
	String company;
	int year;
	int inch;
	
	Tv (String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void show () {
		System.out.println(company + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
public class Test85 {
	public static void main(String[] args) {
		
		// * main() 메서드는 작성끝. 주석해제하고 실행만 * 
		Tv tv = new Tv("LG", 2022, 45);
		tv.show(); 
		
		
	}
}