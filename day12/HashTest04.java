package day12;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTest04 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("피카츄", 100);
		map.put("파이리", 100);
		map.put("꼬부기", 80);
		map.put("이상해씨", 90);
		
		
		Set set = map.entrySet();			// 키:벨류 세트로 꺼내서 주는 형태
		//System.out.println(set);
		Iterator it = set.iterator();		// 반복자 얻기
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " +  e.getValue());
		}
		
		System.out.println("참가자명단" + map.keySet());
		
		// 총점
		int tot = 0;
		Collection values = map.values(); 	 // 값들만 뽑아오기 
		it = values.iterator();
		while(it.hasNext()) {
			int i = (Integer)it.next();
			tot += i;
		}
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + (tot/set.size()));
		System.out.println("최고점 : " + Collections.max(values));
		System.out.println("최저점 : " + Collections.min(values));
	}

}
