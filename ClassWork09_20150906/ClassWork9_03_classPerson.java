

public class ClassWork9_03_classPerson {
	private String sex;
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		} else {
			System.out.println("性别非法");
		}
	}
}
