package coperation;

public class Taxi {

	int taxiNum;
	int taxiPassCount;
	int taxiMoney;

	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	public void takeTaxi(int money) {
		this.taxiMoney += money;
		this.taxiPassCount++;
	}

	public void showTaxiInfo() {
		System.out.println("�ýù�ȣ: " + taxiNum + ", �ý� ����: " + taxiMoney + ", �ý� �°� ��: " + taxiPassCount);

	}

}
