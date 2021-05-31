package Bridge;

public class FriedRice extends Food {
	public FriedRice(Cooking cooking) {
		super(cooking);
	}
	
	public void cooking() {
		System.out.println("ººÀ½¹ä ¸¸µå´Â ¹æ¹ý\n");
		cut();
		fire();
		seasoning();
	}
}
