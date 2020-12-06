package study.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println(" Hello, Calendar");
		System.out.println(" ----------------------");
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println(" ----------------------");
		System.out.println(" 1  2  3  4   5   6   7");
		System.out.println(" 8  9 10 11  12  13  14");
		System.out.println("15 16 17 18  19  20  21");
		System.out.println("22 23 24 25  26  27  28\n");
	}

	public static void main(String[] args) {

		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		System.out.println("반복 횟수를 입력하시오.");
		int repeat = sc.nextInt();

		System.out.println("최대 일수를 보고자 하는 달을 입력하시오.");
		for (int i = 0; i < repeat; i++) {
			int month = sc.nextInt();
			System.out.printf("%d 월은 %d일 까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
		}

	}

}
