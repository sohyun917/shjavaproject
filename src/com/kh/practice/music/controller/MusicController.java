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
	 * ������ ��ġ�� �� �߰�
	 * @param music
	 */
	
	public void addAtLast(Music music) {
		mList.add(music);
	}
	/**
	 * ù ��ġ�� �� �߰�
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * �� ����
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}
	/**
	 * �� ����
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	/**
	 * �̸����� �ε��� ��ȸ
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
	 * �ε����� ����Ʈ���� ��ȸ
	 * @param index
	 * @return Music
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}
	/**
	 * ��ü ������ ��ȸ
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
}
