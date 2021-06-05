package facade;

public class Beverage {
	
//	name을 선언
	private String name;
    
//	name을 받아서와서 Beverage클래스의 name에 저장하는 생성자
    public Beverage(String name)
    {
        this.name = name;
    }
    
//  name을 가져와서 사용하는 메소드
    public void Prepare()
    {
        System.out.println("1. " + name+" 음료 준비 완료 ");
    }
}
