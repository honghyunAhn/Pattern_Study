package decorator;

public class Patty extends PattyDecorator{
	Hamburger hamburger;
	
	public Patty(Hamburger hamburger) {
		super();
		this.hamburger = hamburger;
	}
	
	@Override
	public String getDescription() {
		return hamburger.getDescription()+", 패티 추가";
	}

	@Override
	public int cost() {
		return hamburger.cost() + 1000;
	}
}
