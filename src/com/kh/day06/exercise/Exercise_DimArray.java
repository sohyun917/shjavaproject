package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = (arrs[i].length - 1); j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%3d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) { // 고정값을 먼저 쓴다.
			for (int j = (arrs.length - 1); j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%5d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrs[i].length; j++) {
					System.out.printf("%2d ", arrs[i][j]);
				}
			} else {
				for (int j = (arrs.length - 1); j >= 0; j--) {
					System.out.printf("%2d ", arrs[i][j]);
				}
			}
			System.out.println();
		}

	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		double [][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0.0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		int a = score.length;
		int b = score[0].length;
		System.out.println("4년 전체 평점 평균은 : " + sum/(a*b));
		
	}
}
