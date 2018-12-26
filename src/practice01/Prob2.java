package practice01;

public class Prob2 {
	public static void main(String[] args) {
		int startNum = 1;

		for (int j = 0; j < 9; j++) {
			for (int i = startNum; i < startNum + 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			startNum++;
		}
	}
}
