package classwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassWork18_01 {

	public static void main(String[] args) {
		Map map = new HashMap();

		map.put(1, "��������");
		map.put("hello", "�ַ���");
		map.put(2.1, "����������");
		
		//keyset
		Set keys = map.keySet();
		for (Object key : keys) {
			System.out.println(key);
		}

		//values
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}
		
		Set entrys = map.entrySet();
		for(Object obj :entrys){
				Entry entry = (Entry)obj;
				System.out.println(entry.getKey()+"===>>"+entry.getValue());
		}
	}

}
