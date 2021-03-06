package mattiemonster.megablock.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import mattiemonster.megablock.MegablockDebugMessage;
// import mattiemonster.megablock.*;
import mattiemonster.megablock.engine.*;
import mattiemonster.megablock.main.states.play.PlayFullControl;

public class Megablock extends Game {
	
	private MegablockDebugMessage messageState = new MegablockDebugMessage();
	
	@Override
	public void create() {
		MegablockLog log = new MegablockLog();
		MegablockEngine engine = new MegablockEngine();
		
		messageState.init();
		messageState.turnOn();
		
		log.createLog();
		engine.init();
		
		// MessageNotImplemented.show();
		
		Gdx.graphics.setWindowedMode(1024, 512);
		setScreen(new PlayFullControl(this));
	}

	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
}
