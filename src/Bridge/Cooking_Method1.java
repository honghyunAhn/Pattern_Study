package Bridge;

public class Cooking_Method1 implements Cooking {

	@Override
	public void cut() {
		System.out.println("�߰� ������");
	}

	@Override
	public void fire() {
		System.out.println("���´�");
	}

	@Override
	public void seasoning() {
		System.out.println("�ұ�, ���߷� ���� �Ѵ�");
	}

}
