// 오류남 강사님 예제 참고

import java.util.Scanner;

public class MyCalendar { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year : ");
		int year = sc.nextInt();

		
		System.out.print("Month : ");
		int month = sc.nextInt();
		
		int day = 1;		
		int sum = 0;
		
		for(int i=1; i<=year; i++) {
			if(year % 400 ==0 || (year % 4 ==0 && year % 100 != 0)) {
				sum += 366; // i가 윤년이라면
			}else {
				sum += 365; // i가 윤년이 아니라면
			}
		} //작년 12월 31일까지 합
		for(int i = 2001; i<=year; i++) {
			for(int m=1; m<=12; m++) {
				sum += getLastDay(i, m);
			}
		}
		for(int m=1; m<month; m++) { //i는 for 안에서만 쓰는 지역변수 (중괄호만 열면 지역변수)
			sum += getLastDay(year, m);
		} // 올해 6월 까지 합
		sum++; // 6월 마지막날 다음날
		int space = sum % 7;
		
//		System.out.println("<<<"+year+"년, "+month+"월>>>");
//		System.out.println("일\t 월\t 화\t 수\t 목\t 금\t 토");
//		// 첫 주 공백 출력하는 달력
//		int count = 0;
//		for(int i = 0; i <= space; i++) {
//			System.out.print("☆\t");
//			count++;
		
	
		//첫주 1일부터 마지막 날까지 출력
//		int lastDay = getLastDay(year, month);
//		for(int m=1; m<=lastDay; m++) {
//			System.out.print(i+"\t");
//			count++;
//			if (count%7==0) System.out.println();
//		}
//		
		switch(sum % 7) {
		case 0 : System.out.print("SUN" ); break; 
		case 1 : System.out.print("MON" ); break; 
		case 2 : System.out.print("TUE"); break; 
		case 3 : System.out.print("WED"); break; 
		case 4 : System.out.print("THU"); break; 
		case 5 : System.out.print("FRI"); break; 
		case 6 : System.out.print("SAT"); break; 
		}
		

	}// main end
	
	// 년도와 월을 입력받아서 그 달 마지막 일을 넘겨주는 메소드
	static int getLastDay(int year, int month) { // 메소드 생성, 지역변수 이기 때문에 메인에서 쓰는 month랑 이 지역 month는 다르다 (이것은 지역변수이다.)
		/*int : 숫자형을 넘김*/ //들어오는것이 괄호 나가는 것이 앞	
		int lastDay = 0;
		if(month == 2) // 2월 이라면
		{
			if (year % 400 ==0 || (year % 4 ==0 && year % 100 != 0))  
				lastDay = 29; // 2월인데 윤년이면
			else 
				lastDay = 28; // 2줠인데 윤년이 아니면
		}
		else if(month !=2) // 2월이 아니라면
		{ 
			if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				lastDay = 31;
			else if (month ==4 || month == 6 || month == 9 || month == 11)
				lastDay = 30;
		}
		return lastDay;
	}
}


