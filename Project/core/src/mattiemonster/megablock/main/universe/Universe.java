package mattiemonster.megablock.main.universe;

public class Universe {
	
	@SuppressWarnings("unused")
	private int uniWidth, uniHeight;

	public Universe(int uniWidth, int uniHeight) {
		System.out.println("Universe created");
		System.out.println("Universe size: " + uniWidth + ", " + uniHeight);
		this.uniWidth = uniWidth;
		this.uniHeight = uniHeight;
	}

	public void init() {
		
	}

	public void render(float delta) {
		
	}

	public void dispose() {
		
	}

}
