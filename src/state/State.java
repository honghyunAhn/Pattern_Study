package state;

//���� ����
public interface State {
	public void normal(Clock clock);
	public void alarm(Clock clock);
}
