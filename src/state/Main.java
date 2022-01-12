package state;

public class Main {

	public static void main(String[] args) {
		Clock myClock = new Clock();
		myClock.normal(); // normal 상태에서 normal 호출
		myClock.alarm();  // normal 상태에서 alarm 호출, alarm 작동
		myClock.normal(); // alarm 상태에서 normal 호출
	}
}
