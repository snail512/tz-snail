package classwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ClassWork18_02 {

	public static void main(String[] args) {
		HashMap<String, ClassWork18_02_Prople> map = new HashMap<String, ClassWork18_02_Prople>();
		
		map.put("张三", new ClassWork18_02_Prople(24, 56));
		map.put("李四", new ClassWork18_02_Prople(28, 66));
		map.put("王五", new ClassWork18_02_Prople(34, 76));
		map.put("吴六", new ClassWork18_02_Prople(22, 55));

		//keyset
		Set keys = map.keySet();
		for (Object key : keys) {
			System.out.println(key + "\t" +map.get(key).show());
		}

		//entrySet
		Set entrys = map.entrySet();
		for(Object obj :entrys){
				Entry entry = (Entry)obj;
				System.out.println(entry.getKey() + "  ====>>>>  " + ((ClassWork18_02_Prople)entry.getValue()).show());
		}
	}

}
