
public class ClassWork6_06 {
	public static void main(String[] args) {
		int[] array = {10, 2, 1, 99, 23};
		
		//��С����
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		System.out.println("��С����:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		//�Ӵ�С
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		System.out.println("\n" + "�Ӵ�С:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
