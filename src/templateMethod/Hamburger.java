package templateMethod;

//공통 기능을 구현하고 세부 기능은 추상화한 추상클래스(햄버거제작)
public abstract class Hamburger {
//	햄버거를 만드는데 필요한 행동들
	public final void makeHamburger() {
		cookingName();
		toastBun();
		roastPatty();
		prepareSalad();
		spraySource();
	}
	
//	공통 메소드
	private void toastBun() {
		System.out.println("번을 굽는다.");
	}
	
//	공통 메소드
	private void prepareSalad() {
		System.out.println("샐러드를 준비한다.");
	}
	
//	공통 메소드
	private void spraySource() {
		System.out.println("소스를 뿌린다.");
	}
	
//	실제 구현이 필요한 부분
	abstract void cookingName();
	abstract void roastPatty();
}
