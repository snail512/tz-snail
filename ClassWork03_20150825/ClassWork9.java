package wwwang.com;

import java.util.Scanner;

public class ClassWork9 {
	public static void main(String[] args) {
		System.out.println("����Сʱ��:");
		
		Scanner ii = new Scanner(System.in);
		int hour = ii.nextInt();
		
		int day = hour / 24;	
		int overHour = hour - 24 * day;
		
		System.out.println("��Сʱ����" + day + "����" + overHour +"Сʱ");
	}
}
