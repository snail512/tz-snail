
public class ClassWork9_04_classZhaFruit {
	public String getFruitZhi(ClassWork9_04_classApple a) {
		String str = "һ��" + a.getColor() + "��" + a.getName() + "֭��ζ��" + a.getWeiDao();
		return str;
	}
	
	public String getFruitZhi(ClassWork9_04_classApple a, ClassWork9_04_classBanana b) {
		String str = "һ��" + a.getColor() + b.getColor() + "��" + a.getName() + b.getName() + "֭��ζ��" + a.getWeiDao() + b.getWeiDao();
		return str;
	}
	
	public String getFruitZhi(ClassWork9_04_classApple a, int num){
		String str = num + "��" + a.getColor() + "��" + a.getName() + "֭��ζ��" + a.getWeiDao();
		return str;
	}
}
