package coperation;

public class Bus {

	int busNum;
	int passengerCount;
	int money;

	public Bus(int busNum) {
		this.busNum = busNum;
		passengerCount=0;
	}

	public void takeBus(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println("������ȣ: " + busNum + ", ���� ����: " + money + ", ���� �°� ��: " + passengerCount);
	}

}
