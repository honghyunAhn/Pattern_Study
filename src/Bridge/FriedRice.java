package Bridge;

public class FriedRice extends Food {
	public FriedRice(Cooking cooking) {
		super(cooking);
	}
	
	public void cooking() {
		System.out.println("������ ����� ���\n");
		cut();
		fire();
		seasoning();
	}
}
