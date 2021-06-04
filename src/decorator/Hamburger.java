package decorator;

public abstract class Hamburger {
	String description = "이름 없음";
	
	public abstract int cost();
	
	public String getDescription() {
		return description;
	}
}