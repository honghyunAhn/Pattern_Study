package composite;

public class Marine implements UnitInfo{
	private int mineral;
	private int damage;

	public Marine(int mineral, int damage) {
		this.mineral = mineral;
	    this.damage = damage;
	}
	
	@Override
	public int useMineral() {
		return mineral;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}
}
