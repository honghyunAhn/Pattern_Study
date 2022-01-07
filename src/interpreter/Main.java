package interpreter;

public class Main {
	// Rule: ���, ����� �����̴�
	public static Expression getFruitExpression() {
		Expression apple = new TerminalExpression("���");
		Expression strawberry = new TerminalExpression("����");
		return new OrExpression(apple, strawberry);
	}

	// Rule: ���� ���ֵ��� �ְ��
	public static Expression getJejuMandarinExpression() {
		Expression mandarin = new TerminalExpression("��");
		Expression jeju = new TerminalExpression("���ֵ�");
		return new AndExpression(mandarin, jeju);
	}

	public static void main(String[] args) {
		Expression isFruit = getFruitExpression();
		Expression isejuMandarin = getJejuMandarinExpression();

		System.out.println("����� �����ΰ�? " + isFruit.interpret("���"));
		System.out.println("���ֵ� ���� ���� ���ִ°�? " + isejuMandarin.interpret("���ֵ� ��"));
	}
}
