/**
 * 1.������һ��Student���class
	Ȼ��object�У� 
	С�� student1= new ("С��",15,"Ů","��ɳ")��
	С�� student2= new ("С��",16,"����")��
	С�� student3= new ("С��",17,"��","����","δ��")��
	Ȼ�����Щ��Ϣ���ŵ�һ��LinkedList��
       1����ΪС������Ա���Ϣ
       2���뽫С��δ�����Ϣɾ��0
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
	    
	    list.add(new ClassWork17_01_Student("С��", 15, "Ů", "��ɳ"));
	    list.add(new ClassWork17_01_Student("С��", 16, "����"));
	    list.add(new ClassWork17_01_Student("С��", 17, "��", "����", "δ��"));
	    
	    for (Object stu : list) {
			if (((ClassWork17_01_Student)stu).name.equals("С��")) {
				((ClassWork17_01_Student)stu).sex = "��";
			}
			
			if (((ClassWork17_01_Student)stu).name.equals("С��")) {
				((ClassWork17_01_Student)stu).info = null;
			}
		}
	    
	    Iterator it = list.iterator();
	    while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	    
	}

}
