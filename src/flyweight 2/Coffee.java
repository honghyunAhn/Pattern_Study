package flyweight;

public class Coffee implements ICoffee {
	 
    private final String flavor;
 
    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("커피 만들기! - " + flavor);
    }
 
    public String getFlavor() {
        return this.flavor;
    }
 
    public void serveCoffee(CoffeeContext context) {
        System.out.println(flavor + " - " + context.getTable() + " 번 테이블에 서빙");
    }
 
}
