

import java.util.Scanner;

public class ClassWork5_09 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("����n:");
		int n = in.nextInt();
		
		if (n < 0) {
			System.out.println("����ֵ����");
			return;
		}
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1 + 2 + .... + n =" + sum);
	}
}
