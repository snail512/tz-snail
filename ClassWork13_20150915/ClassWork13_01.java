package classwork;

public class ClassWork13_01 {

	public static void main(String[] args) {
		ClassWork13_01_User use1 = new ClassWork13_01_User("王一一", 23, "男");
		ClassWork13_01_User use2 = new ClassWork13_01_User("王一一", 23, "男");
		ClassWork13_01_User use3 = new ClassWork13_01_User("王二二", 24, "女");
		
		
		System.out.println(use1 == use2);
		System.out.println(use1.equals(use2));
		
		System.out.println(use1 == use3);
		System.out.println(use1.equals(use3));
		

	}

}
