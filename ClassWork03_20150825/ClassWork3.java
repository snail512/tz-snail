package wwwang.com;

import java.util.Scanner;

public class ClassWork3 {
	public static void main(String[] args) {
		double c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("�����һ��С��:");
		double a = in.nextDouble();
		
		System.out.println("����ڶ���С��:");
		double b = in.nextDouble();
		
		c = a;
		a = b;
		b =c;
		
		System.out.println("�������һ��С�� =" + a);
		System.out.println("������ڶ���С�� =" + b);	
	}
}
