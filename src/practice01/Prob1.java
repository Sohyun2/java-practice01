package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("수를 입력하시오 : ");
		num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("3의 배수라요.");
		} else {
			System.out.println("3의 배수가 아니라요..");
		}
		sc.close();
	}
}
