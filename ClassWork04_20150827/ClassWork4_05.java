

import java.util.Scanner;

public class ClassWork4_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("����һ������:");
		int n = in.nextInt();
		
		switch (n) {
		case 0:
			System.out.println("ʯͷ");
			break;
			
		case 1:
			System.out.println("����");
			break;
			
		case 2:
			System.out.println("��");
			break;

		default:
			System.out.println("����");
			break;
		}
		
	}
}
