

public class ClassWork11_03_classDog extends ClassWork11_03_classAnimal{
	ClassWork11_03_classDog(String name, double weight){
		super(name, weight);
	}
	
	public void yao(){
		System.out.println("动物" + name + "体重" + weight + "惹我了，咬死你");
	}
}
