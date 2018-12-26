package practice01;

public class Prob5 {

	public static void main(String[] args) {

		int num1 = 1; // 10의자리 수
		int num2 = 1; // 1의 자리 수

		for (int i = 1; i <= 99; i++) {
			
			if(i>10) { //10의자리 분리 위해서..
				num1 = i / 10;
			}
			
			num2 = i % 10;
			
			// 10의 배수이지만 3의 배수가 아닐 경우..
			if(i%10 == 0 && i%3!=0) continue;
			
			if(num1 % 3 == 0 && num2 % 3 == 0) { // 두 수 모두 3의 배수일 경우
				System.out.println(i + " 짝짝");
			} else if (num1 % 3 == 0 || num2 % 3 == 0) { // 두 수 중에서 하나라도 3의 배수일 경우
				System.out.println(i + " 짝");
			} 
		}
	}
}
