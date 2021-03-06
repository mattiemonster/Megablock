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
	
	public int d2(int a, int b) {
		return math.div2(a, b);
	}
	
	public int m2(int a, int b) {
		return math.mul2(a, b);
	}
	
	public double a2d(double a, double b) {
		return math.add2double(a, b);
	}
	
	public double s2d(double a, double b) {
		return math.sub2double(a, b);
	}
	
	public double d2d(double a, double b) {
		return math.div2double(a, b);
	}
	
	public double m2d(double a, double b) {
		return math.mul2double(a, b);
	}

}
