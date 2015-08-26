package wwwang.com;

import java.util.Scanner;

public class ClassWork8 {
	public static void main(String[] args) {
		System.out.println("请输入一个四位整数");
		
		Scanner ii = new Scanner(System.in);
		int num = ii.nextInt();		
		int a = num / 1000;
		int b = (num - 1000 * a) / 100;
		int c = (num - 1000 * a - 100 * b) / 10;
		int d = num % 10;
		
		System.out.println("千位数" + a);
		System.out.println("百位数" + b);
		System.out.println("十位数" + c);
		System.out.println("个位 数" + d);
	}
}
