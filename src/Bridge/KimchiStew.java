package Bridge;

public class KimchiStew extends Food{
	public KimchiStew(Cooking cooking) {
		super(cooking);
	}
	
	public void cooking() {
		System.out.println("��ġ� ����� ���\n");
		cut();
		fire();
		seasoning();
	}
}
