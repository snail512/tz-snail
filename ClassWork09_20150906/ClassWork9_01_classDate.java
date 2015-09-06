
public class ClassWork9_01_classDate {
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public void setYear(int year){
		if (year < 0) {
			System.out.println("���ô���");
			return;
		}
		this.year = year;
	}
	public void setMonth(int month){
		if (month < 1 || month > 12) {
			System.out.println("���ô���");
			return;
		}
		this.month = month;
	}
	public void setDay(int day){
		if (month != 2) {
			if (day < 1 || day > 31) {
				System.out.println("���ô���");
				return;
			}
			this.day = day;
		} else {
			if ((year % 400) == 0 || (year % 4 == 0 && year % 100 != 0)) {
				//����
				if (day < 1 || day > 29) {//��Ȼ����ȷ���Ǹ�������·����жϣ�����ֻ�Ǽ򵥵��ж�
					System.out.println("���ô���");
					return;
				}					
			} else {
				if (day < 1 || day > 28) {//��Ȼ����ȷ���Ǹ�������·����жϣ�����ֻ�Ǽ򵥵��ж�
					System.out.println("���ô���");
					return;
				}
			}
			this.day = day;	
		}
	}

	public int theMonthIsDay(){
		int theDay = 0;
		
		if (month < 1 || month > 12) {
			System.out.println("�·ݷǷ�");
			return 0;
		}
		if (month != 2) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				theDay = 31;
				break;
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:
				theDay = 30;
			default:
				break;
			}
			
		} else {
			if ((year % 400) == 0 || (year % 4 == 0 && year % 100 != 0)) {
				//����
				theDay = 29;
			} else {
				//ƽ��
				theDay = 28;
			}
		}

		
		return theDay;
	}
}
