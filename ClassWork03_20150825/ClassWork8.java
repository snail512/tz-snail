package wwwang.com;

import java.util.Scanner;

public class ClassWork8 {
	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		
		Scanner ii = new Scanner(System.in);
		int num = ii.nextInt();		
		int a = num / 1000;
		int b = (num - 1000 * a) / 100;
		int c = (num - 1000 * a - 100 * b) / 10;
		int d = num % 10;
		
		System.out.println("ǧλ��" + a);
		System.out.println("��λ��" + b);
		System.out.println("ʮλ��" + c);
		System.out.println("��λ ��" + d);
	}
}
