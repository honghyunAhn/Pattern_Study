package strategy;

public class Main {

	public static void main(String[] args) {
		//����
        Car car1 = new Car(new UpBehavior()); 
        car1.move(); 
        
        //����
        Car car2 = new Car(new DownBehavior()); 
        car2.move();
        
        //��ȸ��
        car2.setMoveBehavior(new LeftBehavior()); 
        car2.move();
        
        //��ȸ��
        car2.setMoveBehavior(new RightBehavior()); 
        car2.move();
	}
}
