package wwwang.com;

import java.util.Scanner;

public class ClassWork4 {
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入正方形的边长:");
		int n = in.nextInt();
		
		System.out.println("此正方形的周长 = " + n*4);
		System.out.println("此正方形的面积 = " + n*n);
	}

}
