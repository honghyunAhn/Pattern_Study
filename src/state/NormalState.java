package state;

public class NormalState implements State {
	
	Clock clock;
	
	NormalState(){
		System.out.println("\n���� ����");
	}
	@Override
	public void normal(Clock clock) {
		System.out.println("Normal nomal Method ȣ��");
	}

	@Override
	public void alarm(Clock clock) {
		System.out.println("Normal alarm Method ȣ��");
		System.out.println("�˶��� �︳�ϴ�.");
		clock.setState(new AlarmState());
	}

}
