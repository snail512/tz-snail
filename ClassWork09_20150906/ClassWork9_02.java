

public class ClassWork9_02 {
	public static void main(String[] args) {
		ClassWork9_02_classMath math = new ClassWork9_02_classMath();
		
		System.out.println("add(4, 5) = " + math.add(4, 5));
		System.out.println("add(4.1, 5.3) = " + math.add(4.1, 5.3));
		System.out.println("add(\"love\", 3) = " + math.add("love", 3));
		System.out.println("add(2, \"love\") = " + math.add(2, "love"));
		System.out.println("add(3, 8, 10) = " + math.max(3, 8, 10));
		System.out.println("add(2, 5) = " + math.max(2, 5));
	}
}
