

public class ClassWork6_05 {
	public static void main(String[] args) {
		int[] array = {90, 80, 76, 75, 86, 85, 77, 60, 95, 80};
		int max = array[0];
		int min = array[0];
		int sum = 0;
		
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
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("选手得分:" + (sum - max - min) / 8.0);
	}
}
