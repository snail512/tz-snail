

public class ClassWork11_01_classUndergradute extends ClassWork11_01_classStudent{
	private String specialty;
	
	//构造方法
	ClassWork11_01_classUndergradute(String name, int age, String degree, String specialty) {
		//第一行先调用父类的带参数的构造方法
		super(name, age, degree);
		this.specialty = specialty;
	}
	
	//显示属性
	public void show(){
		super.show();
		System.out.println("specialty:" + specialty);
	}

}
