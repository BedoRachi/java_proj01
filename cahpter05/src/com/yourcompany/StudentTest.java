package com.yourcompany;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("�̻��");
		studentLee.setStudentID(2021);
		studentLee.setGrade(90);
		studentLee.setAddress("��õ");
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.getStudentID());
		System.out.println(studentLee.getGrade());
		System.out.println(studentLee.getAddress());

	}

}
