

public class ClassWork11_01_classUndergradute extends ClassWork11_01_classStudent{
	private String specialty;
	
	//���췽��
	ClassWork11_01_classUndergradute(String name, int age, String degree, String specialty) {
		//��һ���ȵ��ø���Ĵ������Ĺ��췽��
		super(name, age, degree);
		this.specialty = specialty;
	}
	
	//��ʾ����
	public void show(){
		super.show();
		System.out.println("specialty:" + specialty);
	}

}
