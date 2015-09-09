

public class ClassWork11_02_classBullen extends ClassWork11_02_classWenpen{
	private String type;
	
	ClassWork11_02_classBullen(int power, int speed) {
		super(power, speed);
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void bullenAttack(){
		System.out.println("我是子弹" + type + "，速度" + speed + "，攻击力" + power);
	}
	
}
