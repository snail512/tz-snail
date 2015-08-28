

public class ClassWork5_08 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(sum <= 500) {
			sum += i;
			i += 2;
		}
		System.out.println("1 + 2 + 3 + ..... 刚好大于500时为" + sum);
	}
}
