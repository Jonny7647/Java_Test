package day09;

//아래 추상클래스를 상속받은 MyCalc 클래스를 구현하세요

abstract class Calculator {
	abstract int add(int a, int b);
	abstract int substract(int a, int b);
	abstract double average(int [] a);
}

class MyCalc extends Calculator {

	@Override
	int add(int a, int b) {
		return a + b;
	}

	@Override
	int substract(int a, int b) {
		return a - b;
	}

	@Override
	double average(int[] a) {
		double sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum / a.length;
	}
	
	
	
}
public class Test118 {

	public static void main(String[] args) {

		MyCalc c = new MyCalc();
		System.out.println(c.add(10,20));
		System.out.println(c.substract(100,90));
		System.out.println(c.average(new int[]{1,2,3,4,5}));
	}

}
