package Bridge;

public class KimchiStew extends Food{
	public KimchiStew(Cooking cooking) {
		super(cooking);
	}
	
	public void cooking() {
		System.out.println("±èÄ¡Âî°³ ¸¸µå´Â ¹æ¹ý\n");
		cut();
		fire();
		seasoning();
	}
}
