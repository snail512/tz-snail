

import java.util.Scanner;

public class ClassWork6_01 {
	public static void main(String[] args) {
		int sum = 0;
		int[] a = new int[8];
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入8个同学的成绩:");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			sum += a[i];
		}
		
		System.out.println("总分:" + sum);
		System.out.println("平均分:" + sum / 8.0);
	}
}
