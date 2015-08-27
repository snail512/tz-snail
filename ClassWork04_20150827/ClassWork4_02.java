

import java.util.Scanner;

public class ClassWork4_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("语文:");
		int chinese = in.nextInt();
		
		System.out.println("数学:");
		int math = in.nextInt();
		
		System.out.println("英语:");
		int english = in.nextInt();
		
		System.out.println("平均分:" + (chinese + math + english) / 3.0);
	}
}
