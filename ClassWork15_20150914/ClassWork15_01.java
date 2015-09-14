package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWork15_01 {
	public static void main(String[] args) {
		int idx = -1;
		int num = 0;
		int result = 0;
		
		int[] arr = {8, 12, 35, 90, 5, 6, 54, 12, 34, 56};
	
		//打印数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		
		//输入下标
		try {
			System.out.print("index input:");
			idx = in.nextInt();
			if (idx < 0 || idx > 9) {
				throw new Exception("输入的下标非法！");
			}
		} catch (InputMismatchException e) {
			System.out.println("输入的不是数字");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		//输入要除的数字
		try {
			boolean flag = false;
			System.out.print("num input:");
			num = in.nextInt();
		
			if (num == 0) {
				throw new Exception("输入要除的数字非法！");
			}
		} catch (InputMismatchException e) {
			System.out.println("输入的不是数字");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		//计算结果
		try {
			if (num == 0) {
				throw new Exception("除数为0");
			}
			else {
				throw new Exception(String.valueOf(arr[idx] / num));
			}
		} catch (InputMismatchException e) {
			System.out.println("输入的不是数字");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
