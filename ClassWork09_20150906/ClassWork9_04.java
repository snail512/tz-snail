

public class ClassWork9_04 {
	public static void main(String[] args) {
		ClassWork9_04_classApple apple = new ClassWork9_04_classApple("ƻ��", "��", "�����");
		ClassWork9_04_classBanana banana = new ClassWork9_04_classBanana("�㽶", "��", "�����");
		ClassWork9_04_classZhaFruit zhaFruit = new ClassWork9_04_classZhaFruit(); 
		
		System.out.println("getFruitZhi(Apple a):" + zhaFruit.getFruitZhi(apple));
		System.out.println("getFruitZhi(Apple a, Banan b):" + zhaFruit.getFruitZhi(apple, banana));
		System.out.println("getFruitZhi(Apple a, int num):" + zhaFruit.getFruitZhi(apple, 6));
	}
}
