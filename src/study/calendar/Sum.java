package study.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		System.out.printf("%d 와 %d 의 합은 : %d 입니다.", num, num1, num + num1);
		sc.close();

	}

}
