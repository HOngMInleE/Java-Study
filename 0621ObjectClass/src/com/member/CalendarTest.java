package com.member;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {

		int endDay;
		int startWeek;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		int year = sc.nextInt();
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1); // 날짜 계산
		
		
		
		startWeek = sDay.get(Calendar.DAY_OF_WEEK); 
		endDay = eDay.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("   " + year + "년 "+ month + "월 ");
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		
		for(int i = 1; i < startWeek ; i++) {
			System.out.print("    ");
		}
		
		for(int i = 1, s = startWeek; i <= endDay; i++, s++) {
			System.out.print(i < 10 ? "   " + i : "  " + i);
			if(s % 7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
