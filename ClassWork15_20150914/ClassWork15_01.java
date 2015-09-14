package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWork15_01 {
	public static void main(String[] args) {
		int idx = -1;
		int num = 0;
		int result = 0;
		
		int[] arr = {8, 12, 35, 90, 5, 6, 54, 12, 34, 56};
	
		//��ӡ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		
		//�����±�
		try {
			System.out.print("index input:");
			idx = in.nextInt();
			if (idx < 0 || idx > 9) {
				throw new Exception("������±�Ƿ���");
			}
		} catch (InputMismatchException e) {
			System.out.println("����Ĳ�������");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		//����Ҫ��������
		try {
			boolean flag = false;
			System.out.print("num input:");
			num = in.nextInt();
		
			if (num == 0) {
				throw new Exception("����Ҫ�������ַǷ���");
			}
		} catch (InputMismatchException e) {
			System.out.println("����Ĳ�������");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		//������
		try {
			if (num == 0) {
				throw new Exception("����Ϊ0");
			}
			else {
				throw new Exception(String.valueOf(arr[idx] / num));
			}
		} catch (InputMismatchException e) {
			System.out.println("����Ĳ�������");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
