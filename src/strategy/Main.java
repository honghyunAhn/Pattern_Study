package strategy;

public class Main {

	public static void main(String[] args) {
		//전진
        Car car1 = new Car(new UpBehavior()); 
        car1.move(); 
        
        //후진
        Car car2 = new Car(new DownBehavior()); 
        car2.move();
        
        //좌회전
        car2.setMoveBehavior(new LeftBehavior()); 
        car2.move();
        
        //우회전
        car2.setMoveBehavior(new RightBehavior()); 
        car2.move();
	}
}
