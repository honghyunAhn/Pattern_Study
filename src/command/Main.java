package command;

public class Main {
	public static void main(String args[]) {
		Heater heater = new Heater();
		Lamp lamp = new Lamp();

		Command heaterOnCommand = new HeaterOnCommand(heater);
		Command lampOnCommand = new LampOnCommand(lamp);
		OKGoogle okGoogle = new OKGoogle();

		// 히터를 켠다
		okGoogle.setCommand(heaterOnCommand);
		okGoogle.talk();

		// 램프를 켠다
		okGoogle.setCommand(lampOnCommand);
		okGoogle.talk();
	}
}

