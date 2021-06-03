package composite;

public class Medic implements UnitInfo {
	private int mineral;
	private int damage;

	public Medic(int mineral, int damage) {
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
