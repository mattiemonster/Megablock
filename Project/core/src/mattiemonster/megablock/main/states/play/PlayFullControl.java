package mattiemonster.megablock.main.states.play;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import mattiemonster.megablock.main.Megablock;
import mattiemonster.megablock.main.universe.Universe;

public class PlayFullControl implements Screen {
	
	public Megablock megablock;
	
	public Universe uniOververse;

	public PlayFullControl(Megablock megablock) {
		this.megablock = megablock;
	}

	@Override
	public void show() {
		uniOververse = new Universe(100, 100);
		uniOververse.init();
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		uniOververse.render(delta);
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		System.out.println("Internal:	PlayFullControl: Disposing state");
		
		uniOververse.dispose();
	}

}
