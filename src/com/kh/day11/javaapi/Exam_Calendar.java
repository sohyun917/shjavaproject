package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String [] args) {
		Exam_Calendar exCal = new Exam_Calendar();
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("현재", today);
		
		System.out.println();
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("개강일", someDate);
		
		System.out.println();
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2023, 4, 2);
		endDate.set(Calendar.HOUR_OF_DAY, 17);
		endDate.set(Calendar.MINUTE, 50);
		exCal.printCalendar("종강일", endDate);
//		Calendar today = Calendar.getInstance(); 
//		int year = today.get(Calendar.YEAR);
//		int month = today.get(Calendar.MONTH)+1;	//0부터 계산하기때문에
//		int day = today.get(Calendar.DAY_OF_MONTH);
//		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);	//일요일을 1로 보고 시작한다.
//		int hour = today.get(Calendar.HOUR);
//		int minute = today.get(Calendar.MINUTE);
//		int second = today.get(Calendar.SECOND);
//		System.out.println("년도 : " + year);
//		System.out.println("월 : " + month);
//		System.out.println("일 : " + day);
//		System.out.println("요일 : " + dayOfWeek);
//		System.out.println("시 : " + hour);
//		System.out.println("분 : " + minute);
//		System.out.println("초 : " + second);
//		
		//매번 쓰기 어렵기때문에 모듈화해서 사용한다 보통
	}
	
	public void printCalendar(String msg, Calendar cal) {
//		Calendar today = Calendar.getInstance(); //today가 있으면호출됐을 당시의 값을 가져온다.
		int year	    = cal.get(Calendar.YEAR);
		int month	    = cal.get(Calendar.MONTH)+1;	
		int day 		= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek 	= cal.get(Calendar.DAY_OF_WEEK); //요일표시
		int hourOfDay 	= cal.get(Calendar.HOUR_OF_DAY); //24시간표시
		int ampm	    = cal.get(Calendar.AM_PM);
		int hour 		= cal.get(Calendar.HOUR);
		int minute 		= cal.get(Calendar.MINUTE);
		int second 		= cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); //밀리세컨드
		//현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
		System.out.print(msg + " " + year + "/" + month + "/" + day + "/" );
		switch(dayOfWeek) {	//요일이 숫자로 나왔던걸 월화수 같은걸로 바꿔주는거야.
			case Calendar.SUNDAY :		System.out.print("일요일"); break;
			case Calendar.MONDAY :		System.out.print("월요일"); break;
			case Calendar.TUESDAY :		System.out.print("화요일"); break;
			case Calendar.WEDNESDAY :	System.out.print("수요일"); break;
			case Calendar.THURSDAY :	System.out.print("목요일"); break;
			case Calendar.FRIDAY :		System.out.print("금요일"); break;
			case Calendar.SATURDAY :	System.out.print("토요일"); break;
		}
		System.out.print("(" + hourOfDay + "시)");
		if(ampm == Calendar.AM) System.out.print(" 오전 ");
		else System.out.print(" 오후 ");
		System.out.print(hour + "시" + minute + "분" + second + "초" + millisecond + "밀리초");
	}
}
