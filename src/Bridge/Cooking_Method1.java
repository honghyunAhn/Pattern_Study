package Bridge;

public class Cooking_Method1 implements Cooking {

	@Override
	public void cut() {
		System.out.println("잘게 다진다");
	}

	@Override
	public void fire() {
		System.out.println("볶는다");
	}

	@Override
	public void seasoning() {
		System.out.println("소금, 후추로 간을 한다");
	}

}
