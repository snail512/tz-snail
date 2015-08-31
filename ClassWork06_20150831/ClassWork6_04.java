

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
		
		System.out.println("最大值 = " + max + "\t最小值 = " + min + "\t\t最大值与最小值的差 = " + (max - min));
	}
}
