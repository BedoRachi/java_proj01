package hiding;

public class This_Circle {
	int radius;

	public This_Circle(int radius) {
		this.radius = radius; // this�� �ֱ� ������ ���� �̸��� ����(��������)�� ����(�������)�� ���� �ν� �ȴ�.(������ ���ڰ� ���� �ٸ��� �νĵǾ� ������ ���ڸ� �ִ´�.)
	}

	public void set(int radius) {
		radius = radius; // this�� ���� ������ ���� �̸��� ���ڿ� ������ ���� �νĵ��� �ʴ´�(=���� ���ڷ� �νĵǾ� ������ ����� �ʴ´�)
	}
	
	public void set2(int r) {
		radius = r;//����(�������)�� ����(��������)�� �̸��� �ٸ��� ������ this���� �ν��� �ȴ�.
	}

	public static void main(String[] args) {
		
		This_Circle ob1 = new This_Circle(1);
		This_Circle ob2 = new This_Circle(2);
		
		System.out.println(ob1.radius);
		System.out.println(ob2.radius);
		
		ob1.set(3);
		ob2.set(4);
		
		System.out.println(ob1.radius);
		System.out.println(ob2.radius);

	}

}
