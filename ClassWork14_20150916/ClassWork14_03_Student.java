//定义一个学生类，有属性name,age，
//实例化一个学生对象Student s = new Student("张三",30); 
//然后再实例化一个对象Student s1= new Student("张三",30) 
//判断两个对象是不是同一个对象？为什么？怎么样才能使得计算机认为两个对象是同一个对象。
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
		
		//自己类型一样的
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
		ClassWork14_03_Student s = new ClassWork14_03_Student("张三",30);
		ClassWork14_03_Student s1= new ClassWork14_03_Student("张三",30); 
		
		System.out.println("s == s1:\t" + (s == s1));
		System.out.println("s.equals(s1):\t" + s.equals(s1));
	}

}
