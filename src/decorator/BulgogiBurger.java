package decorator;

public class BulgogiBurger extends Hamburger{
	public BulgogiBurger() {
        super();
        description = "불고기버거";
    }
 
    @Override
    public int cost() {
        return 3500;
    }
}
