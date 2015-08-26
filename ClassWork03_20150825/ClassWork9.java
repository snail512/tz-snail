package wwwang.com;

import java.util.Scanner;

public class ClassWork9 {
	public static void main(String[] args) {
		System.out.println("输入小时数:");
		
		Scanner ii = new Scanner(System.in);
		int hour = ii.nextInt();
		
		int day = hour / 24;	
		int overHour = hour - 24 * day;
		
		System.out.println("此小时数是" + day + "天零" + overHour +"小时");
	}
}
