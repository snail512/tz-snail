
public class ClassWork9_04_classZhaFruit {
	public String getFruitZhi(ClassWork9_04_classApple a) {
		String str = "一杯" + a.getColor() + "的" + a.getName() + "汁，味道" + a.getWeiDao();
		return str;
	}
	
	public String getFruitZhi(ClassWork9_04_classApple a, ClassWork9_04_classBanana b) {
		String str = "一杯" + a.getColor() + b.getColor() + "的" + a.getName() + b.getName() + "汁，味道" + a.getWeiDao() + b.getWeiDao();
		return str;
	}
	
	public String getFruitZhi(ClassWork9_04_classApple a, int num){
		String str = num + "杯" + a.getColor() + "的" + a.getName() + "汁，味道" + a.getWeiDao();
		return str;
	}
}
