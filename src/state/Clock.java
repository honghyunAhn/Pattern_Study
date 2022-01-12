package state;

public class Clock {
//	���¸� ����
	private State state; 
	
//	�ʱ���� ����
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
