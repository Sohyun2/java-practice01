package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";

		System.out.print("문자열을 입력하세요 : ");
		str = sc.nextLine();

		int len = str.length();
		int cnt = 1;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < cnt; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
			cnt++;
		}
	}

}
