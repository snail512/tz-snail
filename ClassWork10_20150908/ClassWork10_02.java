

public class ClassWork10_02 {
	public static void main(String[] args) {
		ClassWork10_02_classStudent[] student = new ClassWork10_02_classStudent[4];
		
		student[0] = new ClassWork10_02_classStudent("张三", "No01", 78);
		student[1] = new ClassWork10_02_classStudent("李四", "No02", 88);
		student[2] = new ClassWork10_02_classStudent("王五", "No03", 95);
		student[3] = new ClassWork10_02_classStudent("田六", "No04", 93);

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
			ClassWork10_02_classStudent.totle += student[i].getScore();
		}
		
		//总分
		System.out.println("\n总分:" + ClassWork10_02_classStudent.totle);
		//平均分-调用静态方法
		System.out.println("\n平均分:" + ClassWork10_02_classStudent.averageScore());
	}
}
