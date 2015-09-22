/**
 * 3.定义一个HashSet集合,只能添加Student类型的对象。
 * 往集合内添加多个元素，分别使用foreach语句，Iterator方式循环
 */

package classwork;

import java.util.HashSet;
import java.util.Iterator;

public class ClassWork17_03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
	    set.add(new ClassWork17_01_Student("小红", 15, "女", "长沙"));
	    set.add(new ClassWork17_01_Student("小白", 16, "广州"));
	    set.add(new ClassWork17_01_Student("小黄", 17, "男", "深圳", "未婚"));
	    set.add(new ClassWork17_01_Student("小紫", 14, "女", "重庆"));
	    set.add(new ClassWork17_01_Student("小黑", 19, "福州"));
	    set.add(new ClassWork17_01_Student("小青", 18, "男", "北京", "已婚"));
	    
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
