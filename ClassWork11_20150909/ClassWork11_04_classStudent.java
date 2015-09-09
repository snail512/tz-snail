

public class ClassWork11_04_classStudent {
	static int num = 0;
	
	private ClassWork11_04_classStudent(){
		
	}
	
	public static ClassWork11_04_classStudent createStudent(){
		++ num;
		
		if (num < 4) {
			return (new ClassWork11_04_classStudent());	
		} else {
			return null;
		}
	}
}
