package state;

public class AlarmState implements State {
	
	int min;
	final int ALARM_TIME = 5;
	
	public AlarmState() {
		System.out.println("\n�˶� ����");
		min = 0;
	}
	@Override
	public void normal(Clock clock) {
		// ���� �ð��� ���� �� ���� ���·�
		while(min <= ALARM_TIME) {
			System.out.println("min : " + min);
			min++;
		}
		clock.setState(new NormalState());
	}

	@Override
	public void alarm(Clock clock) {
	}
}
