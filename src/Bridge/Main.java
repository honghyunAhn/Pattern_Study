package Bridge;

public class Main {

	public static void main(String[] args) {
		Food friedrice = new FriedRice(new Cooking_Method1());
		Food kimchistew = new KimchiStew(new Cooking_Method2());
		
		friedrice.cooking();
		
		System.out.println("\n---------------------------\n");
		
		kimchistew.cooking();
	}
}