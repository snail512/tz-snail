

public class ClassWork11_02_classTank extends ClassWork11_02_classWenpen{
	private String dir;//����
	
	ClassWork11_02_classTank(int power, int speed) {
		super(power, speed);
	}
	
	public String getDir(){
		return dir;
	}
	
	public void setDir(String dir){
		this.dir = dir;
	}
	
	public void tankAttack(){
		System.out.println("����̹�ˣ���" + dir + "�����˶����ٶ�" + speed + "��������" + power);
	}
}
