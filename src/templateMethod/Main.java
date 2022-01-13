package templateMethod;

public class Main {

	public static void main(String[] args) {

		Hamburger bulgogiBurger = new BulgogiBurger();
		Hamburger chickenBurger = new ChickenBurger();

		bulgogiBurger.makeHamburger();
		System.out.println("\n==================================\n");
		chickenBurger.makeHamburger();
	}
}
