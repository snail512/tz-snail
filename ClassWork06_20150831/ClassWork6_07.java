import java.util.Scanner;

public class ClassWork6_07 {
	public static void main(String[] args) {
		int n = 0;
		int numOdd = 0;
		int[] array1 = new int[10];
		Scanner in = new Scanner(System.in);
		
		System.out.println("输入10个整数:");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = in.nextInt();
			if (array1[i] != 0 && array1[i] % 2 == 0) {
				numOdd ++;
			}
		}
		
		int[] array2 = new int[numOdd];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != 0 && array1[i] % 2 == 0) {
				array2[n] = array1[i];
				n ++;
			}
		}
		
		System.out.println("偶数数组:");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] + "\t");
		}
	}
}
