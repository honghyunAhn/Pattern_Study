package interpreter;

public class Main {
	// Rule: 사과, 딸기는 과일이다
	public static Expression getFruitExpression() {
		Expression apple = new TerminalExpression("사과");
		Expression strawberry = new TerminalExpression("딸기");
		return new OrExpression(apple, strawberry);
	}

	// Rule: 귤은 제주도가 최고다
	public static Expression getJejuMandarinExpression() {
		Expression mandarin = new TerminalExpression("귤");
		Expression jeju = new TerminalExpression("제주도");
		return new AndExpression(mandarin, jeju);
	}

	public static void main(String[] args) {
		Expression isFruit = getFruitExpression();
		Expression isejuMandarin = getJejuMandarinExpression();

		System.out.println("사과는 과일인가? " + isFruit.interpret("사과"));
		System.out.println("제주도 귤이 가장 맛있는가? " + isejuMandarin.interpret("제주도 귤"));
	}
}
