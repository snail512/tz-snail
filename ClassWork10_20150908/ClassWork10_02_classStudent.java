

public class ClassWork10_02_classStudent {
	private String name;
	private String num;
	private int score;
	public static double totle;
	
	//���췽��
	ClassWork10_02_classStudent(String name, String num, int score){
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
	public double getScore(){
		return score;
	}

	
	//
	public String toString(){
		return "name:" + name + "\tnum:" + num + "\tscore:" + score;
	}
	
	//��̬����
	public static double averageScore(){
		return (totle / 4.0);
	}
}
