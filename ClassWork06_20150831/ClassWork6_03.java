

import java.util.Random;

public class ClassWork6_03 {
	public static void main(String[] args) {
		int numOdd = 0;
		int numEven = 0;
		int num0 = 0;
		int[] array = new int[10];
		
		Random ran = new Random(100);
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100);
			if (array[i] != 0) {
				if (array[i] % 2 == 0) {
					System.out.println("ż��:" + array[i]);
					numOdd ++;
				} else {
					System.out.println("����:" + array[i]);
					numEven ++;
				}
			}
			else {
				num0 ++;
			}
		}
		
		System.out.println("ż������:" + numOdd + "\t��������:" + numEven + "\t0�ĸ���:" + num0);
	}
}
