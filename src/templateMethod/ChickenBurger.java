package templateMethod;

//�ܹ��� �߻� Ŭ������ ����ϴ� ġŲ���� Ŭ����
//���γ����� �����Ѵ�.
public class ChickenBurger extends Hamburger{
	
	@Override
	void cookingName() {
		System.out.println("ġŲ ���Ÿ� ����� ���!!");
	}
	
	@Override
	void roastPatty() {
		System.out.println("ġŲ ��Ƽ�� ���´�.");
	}
}
