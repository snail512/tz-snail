

import java.util.Scanner;

public class ClassWork4_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("����һ����:");
		int n = in.nextInt();
		
		if (n % 2 != 0) {
			System.out.println("�����������");
		} else {
			System.out.println("�������������");
		}
	}
}
