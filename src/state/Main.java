package state;

public class Main {

	public static void main(String[] args) {
		Clock myClock = new Clock();
		myClock.normal(); // normal ���¿��� normal ȣ��
		myClock.alarm();  // normal ���¿��� alarm ȣ��, alarm �۵�
		myClock.normal(); // alarm ���¿��� normal ȣ��
	}
}
