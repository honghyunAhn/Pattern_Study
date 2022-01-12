package state;

//상태 정의
public interface State {
	public void normal(Clock clock);
	public void alarm(Clock clock);
}
