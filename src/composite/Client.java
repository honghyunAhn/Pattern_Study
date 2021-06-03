package composite;

public class Client {
	public static void main(String[] args) {
	    Marine marine = new Marine(50, 20);
	    Medic medic = new Medic(100, 5);
	    Firebat firebat = new Firebat(75, 30);

	    Unit unit = new Unit();
	    unit.addUnitInfo(marine);
	    unit.addUnitInfo(medic);
	    unit.addUnitInfo(firebat);

	    int unitMineral = unit.useMineral();
	    int unitDamage = unit.getDamage();
	    
	    System.out.println("유닛 총 비용 : " + unitMineral + "미네랄");
	    System.out.println("유닛 총 데미지 : " + unitDamage + "데미지");
	}
}
