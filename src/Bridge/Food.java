package Bridge;

public class Food {
	private Cooking cooking;
	
	public Food(Cooking cooking) {
		this.cooking = cooking;
	}
	
	
	public void cut() {
		cooking.cut();
	}
	
	public void fire() {
		cooking.fire();
	}
	
	public void seasoning() {
		cooking.seasoning();
	}
	
	public void cooking() {
		cut();
		fire();
		seasoning();
	}
}
