package wwwang.com;
import java.util.Scanner;

public class ClassWork10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入电视机的单价:");
		double price = in.nextDouble();
		
		System.out.println("数量:");
		int num = in.nextInt();
		
		System.out.println("总价:" + price * num);
		
	}
}
