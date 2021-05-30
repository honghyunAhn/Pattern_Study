package Adapter;

public class Main {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildChicken chicken = new WildChicken();
		Duck chickenAdapter = new ChickenAdapter(chicken);
		
		System.out.println("- ¾ß»ý ´ßÀÌ ¿ó´Ï´Ù : ");
		chicken.ccokio();
		chicken.fly();
		
		System.out.println("\n- Ã»µÕ ¿À¸®°¡ ¿ó´Ï´Ù : ");
		testDuck(duck);
		
		System.out.println("\n- È¯°æ¿À¿°µÈ ¿À¸® : ");
		testDuck(chickenAdapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
