/**
 * 3.����һ��HashSet����,ֻ�����Student���͵Ķ���
 * ����������Ӷ��Ԫ�أ��ֱ�ʹ��foreach��䣬Iterator��ʽѭ��
 */

package classwork;

import java.util.HashSet;
import java.util.Iterator;

public class ClassWork17_03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
	    set.add(new ClassWork17_01_Student("С��", 15, "Ů", "��ɳ"));
	    set.add(new ClassWork17_01_Student("С��", 16, "����"));
	    set.add(new ClassWork17_01_Student("С��", 17, "��", "����", "δ��"));
	    set.add(new ClassWork17_01_Student("С��", 14, "Ů", "����"));
	    set.add(new ClassWork17_01_Student("С��", 19, "����"));
	    set.add(new ClassWork17_01_Student("С��", 18, "��", "����", "�ѻ�"));
	    
	    //foreach
	    System.out.println("foreach");
	    for (Object obj : set) {
			System.out.println((ClassWork17_01_Student)obj);
		}
	    
	    //Iterator
		System.out.println("Iterator");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}
