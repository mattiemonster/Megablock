package mattiemonster.megablock;

public class MegablockDebugMessage {
	
	public static boolean showMessages;

	public MegablockDebugMessage() {
		if (showMessages) {
			System.out.println("Debug messages are currently on!");
			return;
		}
	}
	
	public void init() {
		System.out.println("Setting up debug messages.");
		showMessages = false;
		
		if (showMessages) {
			System.out.println("Debug messages are already on!");
			return;
		}
	}
	
	public void turnOn() {
		showMessages = true;
		System.out.println("Debug messages turned on.");
	}
	
	public void turnOff() {
		showMessages = false;
		System.out.println("Debug messages turned off.");
	}
	
}
