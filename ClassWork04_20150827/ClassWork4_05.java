

import java.util.Scanner;

public class ClassWork4_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("输入一个数字:");
		int n = in.nextInt();
		
		switch (n) {
		case 0:
			System.out.println("石头");
			break;
			
		case 1:
			System.out.println("剪刀");
			break;
			
		case 2:
			System.out.println("布");
			break;

		default:
			System.out.println("错误");
			break;
		}
		
	}
}
