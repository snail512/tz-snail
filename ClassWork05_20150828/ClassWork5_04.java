

public class ClassWork5_04 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		
		while (n <= 99) {
			sum += n;
			n += 2;
		}
		
		System.out.println("1 + 3 + 5 + ... + 99 = " + sum);
	}
}
