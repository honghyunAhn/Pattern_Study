package state;

public class NormalState implements State {
	
	Clock clock;
	
	NormalState(){
		System.out.println("\n보통 상태");
	}
	@Override
	public void normal(Clock clock) {
		System.out.println("Normal nomal Method 호출");
	}

	@Override
	public void alarm(Clock clock) {
		System.out.println("Normal alarm Method 호출");
		System.out.println("알람을 울립니다.");
		clock.setState(new AlarmState());
	}

}
