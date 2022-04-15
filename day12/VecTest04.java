package day12;

import java.util.Iterator;
import java.util.Vector;

public class VecTest04 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		// iterator는 컬렉션 객체에서 iterator()메서드를 통해 얻을 수 있다.
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		// 다시 반복자 사용하고 싶으면, 새로 얻어와야함.
		it = v.iterator();
		int tot = 0;
		while(it.hasNext()) {
			System.out.println("hello");
			int m = it.next();
			tot += m;
			//System.out.println(m);
		}
		System.out.println(tot);
	}

}
