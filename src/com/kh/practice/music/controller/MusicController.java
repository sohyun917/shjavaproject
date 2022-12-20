package com.kh.practice.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music.model.vo.Music;

public class MusicController {
	private List<Music>mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	
	public void addAtLast(Music music) {
		mList.add(music);
	}
	/**
	 * 첫 위치에 곡 추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * 곡 삭제
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}
	/**
	 * 곡 수정
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	/**
	 * 이름으로 음악 목록 검색
	 * @param title
	 */
	public List<Music> searchMusicByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for (Music mOne : mList) {
			if (mOne.getTitle().equals(title)) {
				findList.add(mOne);
			}
		}
		return findList;
	}
	/**
	 * 이름으로 인덱스 조회
	 * @param musicName
	 * @return
	 */
	public int searchOneByName(String musicName) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 인덱스로 리스트에서 조회
	 * @param index
	 * @return Music
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}
	/**
	 * 전체 데이터 조회
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
	public void sortByTitleASC() {
		//정렬하기
//		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				//String은 < 로 대소비교를 할 수 없다.
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
				
//				if(nums[i] > nums[i+1]) {
//					int temp = nums[i];
//					nums[i] = nums[i+1];
//					nums[i+1] = temp;
//				}
			}
		}
	}
	
	public void sortByTitleDESC() {
		//정렬하기
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
				
			}
		}
	}
	
	public void sortBySingerASC() {
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i ; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	public void sortBySingerDESC() {
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i ; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
}
