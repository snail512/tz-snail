

public class ClassWork5_03 {
	public static void main(String[] args) {
		int sum = 50;
		int n = 15;
		int m = 5;
		int k = 0;
		
		while ((n + m * k) <= sum) {
			k++;
		}
		
		System.out.println("´ÎÊýÎª:" + (k - 1));
	}
}
