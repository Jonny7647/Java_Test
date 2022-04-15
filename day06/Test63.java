package day06;

// Tv클래스
// 값저장 : 채널, 볼륨, 전원
// 기능 : 전원 on/off, 볼룰조정, 채널 조정
class Tv {
	int ch = 1, vol = 0;
	boolean power =  false;
	
	void onOff() {			// 전원 on / off
		power = !power;  	// 토글스위치
	}
////////////////////////////////////////////////////	
	void chUp() {	     	// 채널 올림
		ch++;
	}
	void chDowm() {	     	// 채널 내림
		ch--;
	}
////////////////////////////////////////////////////
	void volUp() {			// 볼륨 올림
		vol++;
	}
	void volDown() {		// 볼륨 줄임
		vol--;
	}
	
	void changeCh(int newch) {
		ch = newch;
	}
}

public class Test63 {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		System.out.println(tv.power);
		
		tv.chUp();
		System.out.println(tv.ch);
		
		tv.volUp();
		System.out.println(tv.vol);
		
		tv.changeCh(10);
		System.out.println(tv.ch);
	}

}
