

import java.util.Scanner;

public class ClassWork4_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������a:");
		int a = in.nextInt();
		
		System.out.println("������b:");
		int b = in.nextInt();
		
		if (a >= b) {
			int c = a;
			a = b;
			b = c;
			System.out.println("a = " + a + "\tb =" + b);
		} else {
			System.out.println("a = " + a + "\tb =" + b);
		}
	}
}
