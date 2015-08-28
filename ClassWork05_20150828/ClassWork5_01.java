

public class ClassWork5_01 {
	public static void main(String[] args) {
		int n = 1;
		int m = 0;
		
		System.out.println("1--100之间的偶数为:");
		
		while(n <= 100 ){
			if (n % 2 == 0) {
				System.out.print(n + "\t");
				
				++ m ;
				if(m % 5 == 0){
					System.out.println();
				}				
			}
			n ++;
		}
	}
}
