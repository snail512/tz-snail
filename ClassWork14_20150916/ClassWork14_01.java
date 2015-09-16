//输入一个整数，把其转换为字符、字符串输出

package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWork14_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		try {
			int n = in.nextInt();
			String str = String.valueOf(n);
			System.out.println("转化为字符串为:" + str);
			
			char ch = (char)n;
			System.out.println("转化为字符为:" + ch);
		} catch (InputMismatchException e) {
			System.out.println("输入的非数字");
		} catch (Exception e) {
			System.out.println("其他错误");
		}
		
	}
}
