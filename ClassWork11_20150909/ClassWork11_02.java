

public class ClassWork11_02 {
	public static void main(String[] args) {
		ClassWork11_02_classTank tank = new ClassWork11_02_classTank(80, 60);
		ClassWork11_02_classBullen bullen = new ClassWork11_02_classBullen(98, 99);
		
		tank.setDir("��");
		bullen.setType("��ǹ�ӵ�");
		
		tank.tankAttack();
		bullen.bullenAttack();
	}
}
