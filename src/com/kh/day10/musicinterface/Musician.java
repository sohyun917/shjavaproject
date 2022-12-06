package com.kh.day10.musicinterface;

public class Musician {
	//instrument 부모 piano 자식
	//Instrument ins = new Piano(); 부모가 인터페이스니까 저렇게 써야해
	//피아노 기타 드럼을 다 받을 수 있는 instrument라는 인터페이스를 생성해둔것.
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
