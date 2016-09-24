package mattiemonster.megablock.main.states.play;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import mattiemonster.megablock.main.Megablock;

public class PlayFullControl implements Screen {
	
	public Megablock megablock;

	public PlayFullControl(Megablock megablock) {
		this.megablock = megablock;
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
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
	}

}
