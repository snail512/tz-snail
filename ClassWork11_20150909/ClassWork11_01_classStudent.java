

public class ClassWork11_01_classStudent {
	private String name;
	private int age;
	private String degree;
	
	ClassWork11_01_classStudent(String name, int age, String degree){
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	
	public void show(){
		System.out.println("name:" + name + "\tage:" + age + "\tdegree:" + degree);
	}
}
