package com.kh.day02.exercise;

import java.util.Random;
import java.util.Scanner;

public class Practice_Alone {
	public static void main(String [] args) {
		//{2, 5, 4, 1, 3}
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
