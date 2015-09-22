/**
 * 2.定义一个ArrayList集合类，然后放入多个字符串，
 * 排序，反序（Collections 集合工具类中包含了排序等功能）
 * 用Iterator遍历集合
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
		
		System.out.println("正序打印:");
		Collections.sort(list);
		
	    Iterator it = list.iterator();
	    while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	    
	    System.out.println("反序打印:");
		Collections.sort(list, Collections.reverseOrder());
		
	    Iterator it1 = list.iterator();
	    while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}
	
	}
}
