//输入一个字符串，将此字符串转换为一个整数，如果不成功就继续输入，
//直到成功得到一个整数后，将此数加100输出结果。
package classwork;

import java.util.Scanner;

public class ClassWork14_04 {

	public static void main(String[] args) {
		int m = 0;
		boolean flag = false;
		Scanner in = new Scanner(System.in);

		System.out.println("输入一个字符串:");
		while(!flag){
			try {
				String str = in.next();		
				m = Integer.parseInt(str);
				flag = true;
			} catch (NumberFormatException e) {
				System.out.println("输入的字符串非数字，请重新输入");
			}

		}
		System.out.println("此字符串转化为数字为:" + m);
		System.out.println("m + 100 = " + (m + 100));
	}

}
