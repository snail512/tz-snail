

import java.util.Scanner;

public class ClassWork6_02 {
	public static void main(String[] args) {
		String[] str = new String[5];
		Scanner in = new Scanner(System.in);
		
		System.out.println("������5��ͬѧ������:");
		for (int i = 0; i < str.length; i++) {
			str[i] = in.next();
		}
		
		System.out.println("�����5������:");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
