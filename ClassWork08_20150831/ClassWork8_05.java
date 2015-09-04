
public class ClassWork8_05 {
	public static void main(String[] args) {
		ClassWork8_05_classStudent stu1 = new ClassWork8_05_classStudent();
		ClassWork8_05_classStudent stu2 = new ClassWork8_05_classStudent();
	
		stu1.name = "ÕÅÈý";
		stu1.sex = "ÄÐ";
		stu1.age = 15;
		stu1.high = 166;
		stu1.height = 56;
		stu1.gole = 98;
		stu1.Class = 2;
		
		stu2.name = "°¢ºì";
		stu2.sex = "Å®";
		stu2.age = 14;
		stu2.high = 156;
		stu2.height = 46;
		stu2.gole = 95;
		stu2.Class = 1;
		
		stu1.show();
		stu1.dinging();
		stu1.walk();
		
		stu2.show();
		stu2.dinging();
		stu2.walk();
				
		
	}
}
