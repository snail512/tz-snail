

public class ClassWork10_02 {
	public static void main(String[] args) {
		ClassWork10_02_classStudent[] student = new ClassWork10_02_classStudent[4];
		
		student[0] = new ClassWork10_02_classStudent("����", "No01", 78);
		student[1] = new ClassWork10_02_classStudent("����", "No02", 88);
		student[2] = new ClassWork10_02_classStudent("����", "No03", 95);
		student[3] = new ClassWork10_02_classStudent("����", "No04", 93);

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
			ClassWork10_02_classStudent.totle += student[i].getScore();
		}
		
		//�ܷ�
		System.out.println("\n�ܷ�:" + ClassWork10_02_classStudent.totle);
		//ƽ����-���þ�̬����
		System.out.println("\nƽ����:" + ClassWork10_02_classStudent.averageScore());
	}
}
