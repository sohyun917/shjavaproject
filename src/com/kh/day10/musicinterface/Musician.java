package com.kh.day10.musicinterface;

public class Musician {
	//instrument �θ� piano �ڽ�
	//Instrument ins = new Piano(); �θ� �������̽��ϱ� ������ �����
	//�ǾƳ� ��Ÿ �巳�� �� ���� �� �ִ� instrument��� �������̽��� �����صа�.
	public void playInstrument(Instrument instrument) {
		instrument.play();
	}
//	public void playInstrument(Piano piano) {
//		piano.play();
//	}
//	//overloading
//	public void playInstrument(Guitar guitar) {
//		guitar.play();
//	}
//	public void playInstrument(Drum drum) {
//		drum.play();
//	}
}
