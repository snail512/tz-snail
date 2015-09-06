
public class ClassWork9_01 {
	public static void main(String[] args) {
		ClassWork9_01_classDate date = new ClassWork9_01_classDate();
		
		date.setYear(2015);
		date.setMonth(9);
		date.setDay(6);

		System.out.println(date.getYear() + "年" + date.getMonth() + "月" + date.getDay() + "日");
		System.out.println("这个月天数为:" + date.theMonthIsDay());
	}
}
