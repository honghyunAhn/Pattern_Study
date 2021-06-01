package chain_of_responsibility;

public class Won1Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		int num = cur.getAmount() / 1;
		System.out.println("1원 동전   : " + num + "개 제공");
	}
}

