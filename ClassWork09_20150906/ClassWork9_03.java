

public class ClassWork9_03 {
	public static void main(String[] args) {
		ClassWork9_03_classPerson person = new ClassWork9_03_classPerson();
		ClassWork9_03_classDog dog = new ClassWork9_03_classDog();
		
		System.out.println("dog.yao():");
		dog.yao();
		
		System.out.println("dog.yao(\"you\"):");
		dog.yao("you");
		
		person.setSex("ÄÐ");
		System.out.println("dog.yao(person p):");
		dog.yao(person);
		
	}
}
