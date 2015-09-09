

public class ClassWork11_03_classFrog extends ClassWork11_03_classAnimal{
	ClassWork11_03_classFrog(String name, double weight){
		super(name, weight);
	}
	
	public void swing(){
		System.out.println("动物" + name + "体重" + weight + "洗个澡，真凉快");
	}
}
