package com.kh.practice.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.music.controller.MusicController;
import com.kh.practice.music.model.vo.Music;

public class MusicView {

	public int musicMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === ���� �޴� === === ===");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ��������");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ��� �������� ����");
		System.out.println("9. ������ �������� ����");
		System.out.println("10. ������ �������� ����");
		System.out.println("0. ����");
		System.out.print("�޴� ���� >>");
		int value = sc.nextInt();
		return value;
	}
	
	public Music inputMusicInfo(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println(category + " ��ġ�� �� �߰�");
		System.out.print("��� : ");
		String title = sc.nextLine();
		System.out.print("������ : ");
		String singer = sc.nextLine();
		//�� ���� ������ �ϳ��� �ٷ�� ����
		//��ü�� �ʿ���!
		Music music = new Music(title, singer);
		return music;
	}
	
	public String inputMusicName(String gubun) {
		Scanner sc = new Scanner(System.in);
		System.out.print(gubun + "�� �� �Է� : ");
		String title = sc.nextLine();
		return title;
	}

	public Music modifyMusicInfo(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է� : ");
		String singer = sc.nextLine();
		music.setSinger(singer);
		return music;
	}
	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("������ ������ �Է� : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}

	public void showAllMusicList(List<Music> mList) {
		System.out.println("====== ��ü �� ��� ��� ======");
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.println((i+1) + "��° �뷡 -> " + "��� : " + music.getTitle() + ", ������ : " + music.getSinger());
		}
	}
	
	public void showOneMusic(Music music) {
		System.out.println("�˻��� ���� ����� : " + music.getTitle() + ", �������� : " + music.getSinger() + "�Դϴ�.");
	}
	
	

}
