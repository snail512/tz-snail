/**
 * 1.现在有一个Student类的class
	然后object有： 
	小红 student1= new ("小红",15,"女","长沙")；
	小白 student2= new ("小白",16,"广州")；
	小黄 student3= new ("小黄",17,"男","深圳","未婚")；
	然后把这些信息都放到一个LinkedList中
       1）请为小白添加性别信息
       2）请将小黄未婚的信息删除0
 */


package classwork;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassWork17_01_Student {
	private String name;
	private int age;
	private String sex;
	private String add;
	private String info;
	
	ClassWork17_01_Student(String name, int age, String sex, String add, String info){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.add = add;
		this.info = info;
	}
	
	ClassWork17_01_Student(String name, int age, String sex, String add){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.add = add;
	}
	
	ClassWork17_01_Student(String name, int age, String add){
		this.name = name;
		this.age = age;
		this.add = add;
	}
	
	public String toString(){
		return name + "\t" + age + "\t" + sex + "\t" + add + "\t" + info;
	}

	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    
	    list.add(new ClassWork17_01_Student("小红", 15, "女", "长沙"));
	    list.add(new ClassWork17_01_Student("小白", 16, "广州"));
	    list.add(new ClassWork17_01_Student("小黄", 17, "男", "深圳", "未婚"));
	    
	    for (Object stu : list) {
			if (((ClassWork17_01_Student)stu).name.equals("小白")) {
				((ClassWork17_01_Student)stu).sex = "男";
			}
			
			if (((ClassWork17_01_Student)stu).name.equals("小黄")) {
				((ClassWork17_01_Student)stu).info = null;
			}
		}
	    
	    Iterator it = list.iterator();
	    while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	    
	}

}
