package coperation;

public class Subway {

	int subNum;
	int subPassCount;
	int subMoney;

	public Subway(int subNum) {
		this.subNum = subNum;
	}

	public void takeSubway(int money) {
		this.subMoney += money;
		this.subPassCount++;
	}

	public void showSubInfo() {
		System.out.println("����ö��ȣ: " + subNum + ", ����ö ����: " + subMoney + ", ����ö �°� ��: " + subPassCount);

	}

}
