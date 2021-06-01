package chain_of_responsibility;

public class Won100Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 100) {
			int num = cur.getAmount() / 100;
			int remainder = cur.getAmount() % 100;

			System.out.println("100원 동전 : " + num + "개 제공");

			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else
			this.chain.dispense(cur);
	}
}
