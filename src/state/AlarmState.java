package state;

public class AlarmState implements State {
	
	int min;
	final int ALARM_TIME = 5;
	
	public AlarmState() {
		System.out.println("\n알람 상태");
		min = 0;
	}
	@Override
	public void normal(Clock clock) {
		// 일정 시간이 지난 후 보통 상태로
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
