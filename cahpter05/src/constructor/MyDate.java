package constructor;

public class MyDate {

	private int day, month, year;
	private boolean valid;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int d) {
		day = d;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setYear(int y) {
		year = y;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean isValid() {

		if (year > 1800) {
			if (month > 0 && month < 13) {
				if (month == 2 && day < 29 && day > 0) {
					System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
					return true;
				} else if (month != 2 && day > 0 && day < 32) {
					System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
					return true;
				} else if (month == 2 && day > 28) {
					System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. 2���� 29���� ���� ���� �������� �Դϴ�.");
					return false;
				} else {
					System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. 0���� ũ�� 32���� ���� ���� �������� �Դϴ�.");
					return false;
				}

			} else {
				System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�. 0���� ũ�� 13���� ���� ���� ��������");
				return false;
			}

		} else {
			System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�. 1800���� ū ���� ��������");
			return false;
		}

	}

}
