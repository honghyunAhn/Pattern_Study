package templateMethod;

//�ܹ��� �߻� Ŭ������ ����ϴ� �Ұ����� Ŭ����
//���γ����� �����Ѵ�.
public class BulgogiBurger extends Hamburger{
	
	@Override
	void cookingName() {
		System.out.println("�Ұ�� ���Ÿ� ����� ���!!");
	}
	
	@Override
	void roastPatty() {
		System.out.println("�Ұ�� ��Ƽ�� ���´�.");
	}
}
