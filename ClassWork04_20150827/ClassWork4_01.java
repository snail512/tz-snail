

import java.util.Scanner;

public class ClassWork4_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("输入三角形底:");
		int low = in.nextInt();
		
		System.out.println("输入三角形底:");
		int high = in.nextInt();
		
		System.out.println("此三角形面积:" + low * high / 2.0);
	}
}
