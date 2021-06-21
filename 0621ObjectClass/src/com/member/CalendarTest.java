package com.member;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {

		int endDay;
		int startWeek;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�⵵ �Է�: ");
		int year = sc.nextInt();
		System.out.println("�� �Է�: ");
		int month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1); // ��¥ ���
		
		
		
		startWeek = sDay.get(Calendar.DAY_OF_WEEK); 
		endDay = eDay.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("   " + year + "�� "+ month + "�� ");
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
