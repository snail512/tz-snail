

public class ClassWork11_01_classGraduate extends ClassWork11_01_classStudent{
	private String direction;
	
	ClassWork11_01_classGraduate(String name, int age, String degree, String direction) {
		super(name, age, degree);
		this.direction = direction;
	}

	//œ‘ æ Ù–‘
	public void show(){
		super.show();
		System.out.println("direction:" + direction);
	}
}
