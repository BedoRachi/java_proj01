package constructor;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		int day;
		int month;
		int year;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ��¥ �Է±�");
		System.out.print("���� �⵵�� �Է��ϼ���: ");
		year = scan.nextInt();
		System.out.print("���� ���� �Է��ϼ���: ");
		month = scan.nextInt();
		System.out.print("���� ���� �Է��ϼ���: ");
		day = scan.nextInt();
		System.out.println();
		
		MyDate nowDate = new MyDate(day, month, year);
		if(nowDate.isValid()) {
			System.out.println();
			System.out.println("�������� �Է� Ȯ�� �� ����");
		}
		else {
			System.out.println();
			System.out.print("���� �⵵�� �Է��ϼ���: ");
			nowDate.setYear(scan.nextInt());
			System.out.print("���� ���� �Է��ϼ���: ");
			nowDate.setMonth(scan.nextInt());
			System.out.print("���� ���� �Է��ϼ���: ");
			nowDate.setDay(scan.nextInt());
			if(nowDate.isValid()) {
				System.out.println("�������� �Է� Ȯ�� �� ����");
			}
			else {
				System.out.println("���������� �Է� Ȯ�� �� ����");
			}
		}
		
		
		//MyDate nowDate1 = new MyDate(30,2,2000);
		//System.out.println(nowDate1.isValid());
		//MyDate nowDate2 =new MyDate(2,10,2006);
		//System.out.println(nowDate2.isValid());

	}

}
