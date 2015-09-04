
public class ClassWork8_02 {
	public static void main(String[] args) {
		ClassWork8_02_classDog a = new ClassWork8_02_classDog();
		
		a.name = "花花公子";
		a.corlor = "黄色";
		a.height = 32.5;
		
		a.show();
		
		ClassWork8_02_classDog b = new ClassWork8_02_classDog();
		b.name = "黑熊";
		b.corlor = "黑色";
		b.height = 23.5;
		
		a = b;
		a.show();
		
				
	}
}
