

public class ClassWork6_04 {
	public static void main(String[] args) {
		int[] array = {29, 30, 44, 8, 39};
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("���ֵ = " + max + "\t��Сֵ = " + min + "\t\t���ֵ����Сֵ�Ĳ� = " + (max - min));
	}
}
