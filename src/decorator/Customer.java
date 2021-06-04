package decorator;

public class Customer {
	public static void main(String[] args) {
		Hamburger hamburger1 = new ChickenBurger();
		
		hamburger1 = new Cheese(hamburger1);
		hamburger1 = new Patty(hamburger1);
		
		Hamburger hamburger2 = new BulgogiBurger();
		
		hamburger2 = new Cheese(hamburger2);
		hamburger2 = new Cheese(hamburger2);
		
		System.out.print("메뉴 1: " + hamburger1.getDescription());
		System.out.println(" / 가격 : " + hamburger1.cost() + "원");
		System.out.print("메뉴 2: " + hamburger2.getDescription());
        System.out.println(" / 가격 : " + + hamburger2.cost() + "원");
        int result = hamburger1.cost()+hamburger2.cost();
        System.out.println("==================================================");
        System.out.println("합계 : " + result+ "원");
	}
}
