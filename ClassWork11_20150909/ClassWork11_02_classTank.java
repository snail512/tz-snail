

public class ClassWork11_02_classTank extends ClassWork11_02_classWenpen{
	private String dir;//方向
	
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
		System.out.println("我是坦克，向" + dir + "方向运动，速度" + speed + "，攻击力" + power);
	}
}
