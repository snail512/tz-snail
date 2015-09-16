package classwork;

/*import javax.swing.text.StyledEditorKit.BoldAction;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;*/

public class ClassWork13_01_User extends Object{
	String name;
	int age;
	String sex;
	
	public ClassWork13_01_User(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public int hashCode(){
		return -100;
	}
	
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		//自己类型一样的
		if (obj instanceof ClassWork13_01_User) {
			ClassWork13_01_User user = (ClassWork13_01_User)obj;
			if (user.name.equals(this.name) &&
				user.sex.equals(this.sex) &&
				user.age == this.age) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
