package thisex;
// this�� ���� ������ or �޼ҵ� ȣ��
class Person {
	String name;
	int age;

	Person() { // �⺻ ������
		this("�̸�����", 1); // �⺻�����ڸ� �����ϸ� this�� ���� 2�� �����ڰ� ȣ���
	}

	Person(String name, int age) { //2�� ������
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { // Person Ŭ���������� ��ȯ
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person(); //�⺻ ������ ȣ��

		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName); //noName�� �ּҰ� ���
		
		Person p = noName.returnItSelf();
		System.out.println(p); // p�� �ּҰ� ���

	}

}
