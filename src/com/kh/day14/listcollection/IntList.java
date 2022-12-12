package com.kh.day14.listcollection;

import java.util.Arrays;

public class IntList {
	
	private int [] nums;
	private int size;	//요소 갯수
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	private void resize() {
		int array_capacity = nums.length;
		
		//용량이 꽉 찰 경우
		//용량을 2배로 해줌
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2;
			//새롭게 배열을 만들어줌
			nums = Arrays.copyOf(nums, new_capacity);
		}
	}
	
	public void add(int input) {
		//int input = 3
		//꽉 차 있는 상태라면 크기를 재할당해서 배열을 생성해야한다
		if(size == nums.length) {
			resize();
		}
		//마지막 위치에 요소 추가
		nums[size] = input;
		size++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
