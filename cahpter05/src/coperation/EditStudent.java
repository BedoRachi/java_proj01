package coperation;

import java.util.Scanner;

public class EditStudent {
	
	Scanner scan = new Scanner(System.in);
	String name;
	int grade;
	int money;
	Student student;
	
	
	public EditStudent(String name) {
		this.name = name;
		System.out.print(name + " �л��� �г��� �Է��Ͻÿ� ");
		grade = scan.nextInt();
		System.out.print(name + " �л��� �������� �Է��Ͻÿ� ");
		money = scan.nextInt();
		
		student = new Student(this.name, grade, money);
	}

}
