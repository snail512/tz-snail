

import java.util.Scanner;

public class ClassWork4_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("输入一个数:");
		int n = in.nextInt();
		
		if (n % 2 != 0) {
			System.out.println("这个数是奇数");
		} else {
			System.out.println("这个数不是奇数");
		}
	}
}
