package wwwang.com;

public class ClassWork5 {
	public static void main(String[] args) {
	char a = 'A';
	char b = 'B';
	char c = 'C';
	char d = 'D';
	
	char ad = a;
	char bc = b;
	
	a = d;
	d = ad;
	b = c;
	c = bc;
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
}
}
