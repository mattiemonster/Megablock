package mattiemonster.megablock.engine;

import mattiemonster.megablock.MegablockDebugMessage;

public class MegablockEngine {
	
	private MegablockMath math;

	public MegablockEngine() {
		if (MegablockDebugMessage.showMessages) {
			System.out.println("Engine object created.");	
		}
	}
	
	public void init() {
		math = new MegablockMath();
	}
	
	public int a2(int a, int b) {
		return math.add2(a, b);
	}
	
	public int s2(int a, int b) {
		return math.sub2(a, b);
	}

}
