

import java.util.Scanner;

public class ClassWork4_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("����������?");		
		String str = in.nextLine();

		if (str.equals("true")) {
			System.out.println("ԭ����������ѽ���Ǻ�");
		} else if(str.equals("false")){
			System.out.println("����Ա��ѵ���Ů��");
		} else{
			System.out.println("����");
		}
	}
}
