
import java.util.Scanner;

public class ClassWork7_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("请输入数组中的10个数字:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("请选择排序方式:");
		System.out.println("\t" + "1-冒泡排序");
		System.out.println("\t" + "2-选择排序");
		Scanner iii = new Scanner(System.in);
		int select = iii.nextInt();
		switch (select) {
		case 1:
			BubbleSort(arr);
			break;
		case 2:
			SelectionSort(arr);
			break;
		default:
			System.out.println("选择错误!");
			break;
		}
		
		System.out.println("输入要查找的数:");
		int find = in.nextInt();
		
		int findIndex = halfFind(arr, find);
		if (findIndex != -1) {
			System.out.println("二分法查找" + find + "的下标为" + findIndex);
		}
		else {
			System.out.println("数组中没有该数字！");
		}
	}

	//选择排序
	private static void SelectionSort(int[] arr) {
		int minIndex = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		
		System.out.println("选择排序后(从小到大):");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}

	//冒泡排序
	private static void BubbleSort(int[] arr) {
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("冒泡排序后(从小到大):");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	private static int halfFind(int[] arr, int find) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int minddle = (low + high) / 2;
			
			if (arr[minddle] == find) {
				return minddle;
			}
			
			if (arr[minddle] > find) {
				high = minddle - 1;
			}
			
			if (arr[minddle] < find) {
				low = minddle + 1;
			}
		}
		return -1;
	}
}
