//����һ������������ת��Ϊ�ַ����ַ������

package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWork14_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������:");
		try {
			int n = in.nextInt();
			String str = String.valueOf(n);
			System.out.println("ת��Ϊ�ַ���Ϊ:" + str);
			
			char ch = (char)n;
			System.out.println("ת��Ϊ�ַ�Ϊ:" + ch);
		} catch (InputMismatchException e) {
			System.out.println("����ķ�����");
		} catch (Exception e) {
			System.out.println("��������");
		}
		
	}
}
