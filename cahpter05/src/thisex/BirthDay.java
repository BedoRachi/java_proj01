package thisex;

public class BirthDay {

	int day;
	int month;
	int year;
	
	public void setBirthday(int year) {
		this.year = year;
	}
	
	public void getBirthday() {
		System.out.println(this); // this�� ���� ��ü �� ��ü�� �����
	}
	
	
	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setBirthday(2000);
		System.out.println(bDay); //bDay ��ü�� ���� �����
		bDay.getBirthday();//bDay ��ü�� ���� �����
		
	}
	
}
