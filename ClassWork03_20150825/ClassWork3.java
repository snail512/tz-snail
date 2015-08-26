package wwwang.com;

import java.util.Scanner;

public class ClassWork3 {
	public static void main(String[] args) {
		double c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("输入第一个小数:");
		double a = in.nextDouble();
		
		System.out.println("输入第二个小数:");
		double b = in.nextDouble();
		
		c = a;
		a = b;
		b =c;
		
		System.out.println("交换后第一个小数 =" + a);
		System.out.println("交换后第二个小数 =" + b);	
	}
}
