package com.kh.day11.javaapi;

public class Exam_String {
	public static void main(String [] args) {
		String msg = "Hello Java";
		msg = new String("Hello J");	//원래는 이런 방식을 거쳐서 넣은건데 간단히 한것
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		System.out.println("#이 있는가? : " + data1.contains("#"));
		//contains메소드는 지정한 문자가 들어있는지 아닌지 true/false로 알려준다.
		
		//문자열 연결
		data1 = data1.concat(data2);	//C#,C++
		System.out.println("연결된 문자열 : " + data1);
		
		//공백제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		//c# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		//문자열 분리(★★★★★)
		//위 코드까지 진행되고 나면 data1은 JAVA,C++로 변함
		String [] words = data1.split(",");		//,를 넣으면 배열을 생성해줘
		for(int i = 0; i < words.length; i++) {
			System.out.println("분리된 문자열 : " + i + " : " + words[i]);
		}
		
		//문자열 자르기
		//JAVA,C++에서 5번째 부터 잘라서 오는거
//		data1 = data1.substring(5);
//		System.out.println("문자열 자르기 : " + data1);
		//1번인덱스부터 4번앞의 3번인덱스까지 잘라온다.
		data1 = data1.substring(1, 4);
		System.out.println("범위로 자르기 : " + data1);
		
		char word = data1.charAt(0);
		System.out.println("문자 자르기 : " + word);
	}
}
