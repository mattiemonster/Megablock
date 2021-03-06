package mattiemonster.megablock.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import mattiemonster.megablock.main.Megablock;


public class DesktopLauncher {
	
	public static LwjglApplication app;
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		app = new LwjglApplication(new Megablock(), config);
	}
	
	public static LwjglApplication getApp() {
		return app;
	}
}
