package templateMethod;

//햄버거 추상 클래스를 상속하는 치킨버거 클래스
//세부내용을 구현한다.
public class ChickenBurger extends Hamburger{
	
	@Override
	void cookingName() {
		System.out.println("치킨 버거를 만드는 방법!!");
	}
	
	@Override
	void roastPatty() {
		System.out.println("치킨 패티를 굽는다.");
	}
}
