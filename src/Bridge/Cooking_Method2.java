package Bridge;

public class Cooking_Method2 implements Cooking {

	@Override
	public void cut() {
		System.out.println("�뼺�뼺 �ڸ���");
	}

	@Override
	public void fire() {
		System.out.println("���� ���δ�");
	}

	@Override
	public void seasoning() {
		System.out.println("�ٽô�, �������� ���� �Ѵ�");
	}

}
