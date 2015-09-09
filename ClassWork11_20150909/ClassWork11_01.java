

public class ClassWork11_01 {
	public static void main(String[] args) {
		ClassWork11_01_classUndergradute undergradute = new ClassWork11_01_classUndergradute("张三", 23, "本科", "计算机科学与技术");
		ClassWork11_01_classGraduate graduate = new ClassWork11_01_classGraduate("李四", 26, "研究生", "图像处理");
		
		undergradute.show();
		graduate.show();
	}
}
