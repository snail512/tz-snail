

import java.util.Scanner;

public class ClassWork4_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("你是男人吗?");		
		String str = in.nextLine();

		if (str.equals("true")) {
			System.out.println("原来你是男人呀，呵呵");
		} else if(str.equals("false")){
			System.out.println("你的性别难道是女？");
		} else{
			System.out.println("妖？");
		}
	}
}
