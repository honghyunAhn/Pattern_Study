package Adapter;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("�� ��");

	}

	@Override
	public void fly() {
		System.out.println("��~~ �Ÿ��� ����");
	}
}
