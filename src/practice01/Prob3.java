package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int num = 0;

		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();

		if (num % 2 == 0) { // 입력한 값이 짝수일 경우..
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
		} else { // 입력한 값이 홀수일 경우..
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
		}

		System.out.println("결과 값 : " + sum);
	}
}
