
public class ClassWork8_02 {
	public static void main(String[] args) {
		ClassWork8_02_classDog a = new ClassWork8_02_classDog();
		
		a.name = "��������";
		a.corlor = "��ɫ";
		a.height = 32.5;
		
		a.show();
		
		ClassWork8_02_classDog b = new ClassWork8_02_classDog();
		b.name = "����";
		b.corlor = "��ɫ";
		b.height = 23.5;
		
		a = b;
		a.show();
		
				
	}
}
