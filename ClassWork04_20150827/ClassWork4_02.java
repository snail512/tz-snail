

import java.util.Scanner;

public class ClassWork4_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("����:");
		int chinese = in.nextInt();
		
		System.out.println("��ѧ:");
		int math = in.nextInt();
		
		System.out.println("Ӣ��:");
		int english = in.nextInt();
		
		System.out.println("ƽ����:" + (chinese + math + english) / 3.0);
	}
}
