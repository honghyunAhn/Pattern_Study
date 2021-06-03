package composite;
import java.util.ArrayList;
import java.util.List;

public class Unit implements UnitInfo {
	private List<UnitInfo> units = new ArrayList<UnitInfo>();

	public void addUnitInfo(UnitInfo unitinfo) 
	{
		units.add(unitinfo); 
	}
	
	public void removeUnitInfo(UnitInfo unitinfo) 
	{ 
		units.remove(unitinfo); 
	}
	
	@Override
	public int useMineral() {
		int mineral = 0;
		for(UnitInfo unitinfo : units) {
			mineral += unitinfo.useMineral();
		}
	    return mineral;
	}
	
	@Override
	public int getDamage() {
		int damage = 0;
	    for(UnitInfo unitinfo : units) {
	    	damage += unitinfo.getDamage();
	    }
	    return damage;
	}
}
