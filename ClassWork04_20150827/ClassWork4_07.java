

import java.util.Scanner;

public class ClassWork4_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("����һ������:");
		int n = in.nextInt();
		
		if (n >= 1000) {
			System.out.println("�������>=1000");
		} else {
			System.out.println("�������<1000");
		}
	}
}
