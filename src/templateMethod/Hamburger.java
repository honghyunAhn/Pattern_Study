package templateMethod;

//���� ����� �����ϰ� ���� ����� �߻�ȭ�� �߻�Ŭ����(�ܹ�������)
public abstract class Hamburger {
//	�ܹ��Ÿ� ����µ� �ʿ��� �ൿ��
	public final void makeHamburger() {
		cookingName();
		toastBun();
		roastPatty();
		prepareSalad();
		spraySource();
	}
	
//	���� �޼ҵ�
	private void toastBun() {
		System.out.println("���� ���´�.");
	}
	
//	���� �޼ҵ�
	private void prepareSalad() {
		System.out.println("�����带 �غ��Ѵ�.");
	}
	
//	���� �޼ҵ�
	private void spraySource() {
		System.out.println("�ҽ��� �Ѹ���.");
	}
	
//	���� ������ �ʿ��� �κ�
	abstract void cookingName();
	abstract void roastPatty();
}
