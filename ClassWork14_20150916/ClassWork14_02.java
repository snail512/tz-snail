//����һ���ַ���,������ַ������ж��ٸ���ĸ������

package classwork;

import java.util.Scanner;

public class ClassWork14_02 {
	public static void main(String[] args) {
		int num = 0;
		int ch = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("����һ���ַ���:");
		
		String str = in.next();
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				++ num;
			} else {
				++ ch;
			}
		}
		System.out.println("���ָ���:" + num + "\t��ĸ����" + ch);
	}
}
