package Adapter;

public class Main {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildChicken chicken = new WildChicken();
		Duck chickenAdapter = new ChickenAdapter(chicken);
		
		System.out.println("- �߻� ���� ��ϴ� : ");
		chicken.ccokio();
		chicken.fly();
		
		System.out.println("\n- û�� ������ ��ϴ� : ");
		testDuck(duck);
		
		System.out.println("\n- ȯ������� ���� : ");
		testDuck(chickenAdapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
