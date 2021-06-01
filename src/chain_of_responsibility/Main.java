package chain_of_responsibility;

public class Main {
	private DispenseChain c1;

	public Main() {
		this.c1 = new Won100Dispenser();
		DispenseChain c2 = new Won10Dispenser();
		DispenseChain c3 = new Won1Dispenser();

		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		Main atmDispenser = new Main();
		atmDispenser.c1.dispense(new Currency(378));
	}
}
