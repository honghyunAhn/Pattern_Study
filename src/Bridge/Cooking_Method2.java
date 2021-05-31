package Bridge;

public class Cooking_Method2 implements Cooking {

	@Override
	public void cut() {
		System.out.println("듬성듬성 자른다");
	}

	@Override
	public void fire() {
		System.out.println("냄비에 끓인다");
	}

	@Override
	public void seasoning() {
		System.out.println("다시다, 설탕으로 간을 한다");
	}

}
