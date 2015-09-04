
public class ClassWork8_05_classStudent {
	String name;
	String sex;
	int age;
	int high;
	int height;
	int gole;
	int Class;

	public void show() {
		System.out.println("我是" + Class + "班的一名" + sex + "同学，今年" + age + "岁，身高：" + high + "，体重" + height + "，今年考了" + gole + "分。");
	}
	
	public void dinging() {
		System.out.println("我这吃饭，然后体重增加1");
	}
	
	public void walk() {
		System.out.println("我这走路，然后体重减少1");
	}
}
