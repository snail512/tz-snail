package wwwang.com;
import java.util.Scanner;

public class ClassWork10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("��������ӻ��ĵ���:");
		double price = in.nextDouble();
		
		System.out.println("����:");
		int num = in.nextInt();
		
		System.out.println("�ܼ�:" + price * num);
		
	}
}
