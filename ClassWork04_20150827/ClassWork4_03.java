

import java.util.Scanner;

public class ClassWork4_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("«Î ‰»Î√Î ˝:");
		int second = in.nextInt();
		
		System.out.println((second / 3600) + ":" + (second % 3600 / 60) + ":" + (second % 60));
	}
}
