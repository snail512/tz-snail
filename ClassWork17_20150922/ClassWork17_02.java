/**
 * 2.����һ��ArrayList�����࣬Ȼ��������ַ�����
 * ���򣬷���Collections ���Ϲ������а���������ȹ��ܣ�
 * ��Iterator��������
 */
package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassWork17_02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("ddd");
		list.add("www");
		list.add("ccc");
		list.add("sss");
		list.add("aaa");
		list.add("eee");
		list.add("bbb");
		
		System.out.println("�����ӡ:");
		Collections.sort(list);
		
	    Iterator it = list.iterator();
	    while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	    
	    System.out.println("�����ӡ:");
		Collections.sort(list, Collections.reverseOrder());
		
	    Iterator it1 = list.iterator();
	    while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}
	
	}
}
