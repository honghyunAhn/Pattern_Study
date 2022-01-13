package templateMethod;

//햄버거 추상 클래스를 상속하는 불고기버거 클래스
//세부내용을 구현한다.
public class BulgogiBurger extends Hamburger{
	
	@Override
	void cookingName() {
		System.out.println("불고기 버거를 만드는 방법!!");
	}
	
	@Override
	void roastPatty() {
		System.out.println("소고기 패티를 굽는다.");
	}
}
