//����һ���ַ����������ַ���ת��Ϊһ��������������ɹ��ͼ������룬
//ֱ���ɹ��õ�һ�������󣬽�������100��������
package classwork;

import java.util.Scanner;

public class ClassWork14_04 {

	public static void main(String[] args) {
		int m = 0;
		boolean flag = false;
		Scanner in = new Scanner(System.in);

		System.out.println("����һ���ַ���:");
		while(!flag){
			try {
				String str = in.next();		
				m = Integer.parseInt(str);
				flag = true;
			} catch (NumberFormatException e) {
				System.out.println("������ַ��������֣�����������");
			}

		}
		System.out.println("���ַ���ת��Ϊ����Ϊ:" + m);
		System.out.println("m + 100 = " + (m + 100));
	}

}
