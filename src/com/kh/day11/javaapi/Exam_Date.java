package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String [] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //포맷을 바꿔주는 기능을 함.
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:SS"); //SS는 밀리초, ss가 초(대소문자 구분 필수)
		String transDate1 = trans.format(date);
		String transDate2 = trans2.format(date);
		System.out.println(transDate1);
		System.out.println(transDate2);
		//////////////////////////////////////////////////////
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("changed : " + changed);
	}
}
