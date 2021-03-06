package mattiemonster.megablock;

import mattiemonster.megablock.exception.ExceptionDebugNotInit;

public class MegablockDebugMessage {
	
	public static boolean showMessages;
	public static boolean init = false;
	public static boolean initexcep = false;

	public MegablockDebugMessage() {
		init = false;
		if (showMessages) {
			System.out.println("Debug messages are currently on!");
			return;
		}
	}
	
	public void init() {
		init = true;
		
		System.out.println("Setting up debug messages.");
		showMessages = false;
		
		if (showMessages) {
			System.out.println("Debug messages are already on!");
			return;
		}
	}
	
	public void turnOn() {
		if (!init) {
			try {
				initexcep = true;
				throw new ExceptionDebugNotInit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (initexcep) {
			initexcep = false;
			return;
		}
		
		showMessages = true;
		System.out.println("Debug messages turned on.");
	}
	
	public void turnOff() {
		if (!init) {
			try {
				initexcep = true;
				throw new ExceptionDebugNotInit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (initexcep) {
			initexcep = false;
			return;
		}
		
		showMessages = false;
		System.out.println("Debug messages turned off.");
	}
	
}
