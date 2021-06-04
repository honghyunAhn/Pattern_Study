package decorator;

public class Cheese extends PattyDecorator {
	Hamburger hamburger;
	
	public Cheese(Hamburger hamburger) {
        super();
        this.hamburger = hamburger;
    }

	@Override
	public String getDescription() {
		return hamburger.getDescription() + ", 치즈 추가";
	}

	@Override
	public int cost() {
		return hamburger.cost() + 500;
	}
}
