

public class ClassWork9_03_classDog {
	public void yao() {
		System.out.println("������");
	}
	public void yao(String str) {
		System.out.println("ҧ��ͷ�����㰡");
	}
	public void yao(ClassWork9_03_classPerson person) {
		if (person.getSex().equals("��")) {
			System.out.println("����ȥ˺ҧ");
		} else {
			System.out.println("�ܹ�ȥ������");
		}
	}
}
