//����һ��ѧ���࣬������name,age��
//ʵ����һ��ѧ������Student s = new Student("����",30); 
//Ȼ����ʵ����һ������Student s1= new Student("����",30) 
//�ж����������ǲ���ͬһ������Ϊʲô����ô������ʹ�ü������Ϊ����������ͬһ������
package classwork;

public class ClassWork14_03_Student {
	private String name;
	private int age;
	
	ClassWork14_03_Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int hashCode(){
		return -100;
	}
	
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		//�Լ�����һ����
		if (obj instanceof ClassWork14_03_Student) {
			ClassWork14_03_Student user = (ClassWork14_03_Student)obj;
			if (user.name.equals(this.name) &&
				user.age == this.age) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		ClassWork14_03_Student s = new ClassWork14_03_Student("����",30);
		ClassWork14_03_Student s1= new ClassWork14_03_Student("����",30); 
		
		System.out.println("s == s1:\t" + (s == s1));
		System.out.println("s.equals(s1):\t" + s.equals(s1));
	}

}
