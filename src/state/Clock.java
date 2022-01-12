package state;

public class Clock {
//	상태를 저장
	private State state; 
	
//	초기상태 저장
	public Clock() {
		state = new NormalState();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void normal() {
		state.normal(this);
	}
	
	public void alarm() {
		state.alarm(this);
	}
}
