package decorator;

public class ChickenBurger extends Hamburger{
	public ChickenBurger() {
        super();
        description = "치킨버거";
    }
 
    @Override
    public int cost() {
        return 3000;
    }
}
