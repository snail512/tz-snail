

public class ClassWork9_03_classDog {
	public void yao() {
		System.out.println("汪汪叫");
	}
	public void yao(String str) {
		System.out.println("咬骨头，好香啊");
	}
	public void yao(ClassWork9_03_classPerson person) {
		if (person.getSex().equals("男")) {
			System.out.println("扑上去撕咬");
		} else {
			System.out.println("跑过去舔两口");
		}
	}
}
