package com.kh.day10.exercise;

public class GoodCalc extends Calculator{
	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println("Че : " + calc.add(5, 2));
		System.out.println("Тї : " + calc.substract(9, 3));
		int [] a = {2, 4, 5, 9, 15};
		System.out.println("ЦђБе : " + calc.average(a));
	}
	@Override
	public int add(int a, int b) {
		return  a + b;
	}
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int [] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}return sum/a.length;
	}
}
