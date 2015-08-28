

public class ClassWork5_05 {
	public static void main(String[] args) {
		int n = 0;
		
		System.out.println("200 --- 1000中能被5或8整除的数:");
		for (int i = 200; i <= 1000 ; i++) {
			if (i % 5 == 0 || i % 8 == 0) {
				System.out.print(i + "\t");
				n ++;
				if (n % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}
