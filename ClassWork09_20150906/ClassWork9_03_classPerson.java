

public class ClassWork9_03_classPerson {
	private String sex;
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		if (sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		} else {
			System.out.println("�Ա�Ƿ�");
		}
	}
}
