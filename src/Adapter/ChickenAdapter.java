package Adapter;

public class ChickenAdapter implements Duck {
	Chicken chicken;
	
	public ChickenAdapter(Chicken chicken) {
		this.chicken = chicken;
	}
	
	@Override
	public void quack() {
		chicken.ccokio();

	}

	@Override
	public void fly() {
		chicken.fly();
	}
}
