

public class ClassWork9_02_classMath {
	public int add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public String add(String a, int b) {
		return a + b;
	}
	
	public String add(int a, String b) {
		return a + b;
	}	
	
	public int max(int a, int b, int c) {
		int d = (a > b)?a:b;
		return (d > c)?d:c;
	}
	
	public int max(int a, int b) {
		return (a > b)?a:b;
	}
}
