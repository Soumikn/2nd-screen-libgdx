package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MyGdxGame extends Game implements Screen,InputProcessor {
	Stage stage;
//	TextureRegion rgn_reply;
	TextButton button_reply;
	TextButton.TextButtonStyle reply_style;
	BitmapFont font;

	Game game;
//	Screen1 screen1;
//	MyGdxGame h;
//	float y_touched;
//	float x_touched;
	public MyGdxGame()
	{
		game = this;
	}
//	public MyGdxGame(Game _g)
//	{
//		this.game=_g;
//	}
	@Override
	public void create() {
		// TODO Auto-generated method stub

		font = new BitmapFont();
		stage = new Stage();
		Sprite sp_button =  new Sprite(new TextureRegion(new Texture("whats-app.jpg")));
		Sprite sp_button_active =  new Sprite(new TextureRegion(new Texture("whats-app_active.jpg")));
		reply_style = new TextButton.TextButtonStyle(new TextureRegionDrawable(sp_button),new TextureRegionDrawable(sp_button_active),null,font);
		button_reply = new TextButton("", reply_style);
		button_reply.setPosition(55,55);
		button_reply.setSize(500, 500);
		stage.addActor(button_reply);
		Gdx.input.setInputProcessor(stage);



		button_reply.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				System.out.println("X:" + x + " Y:" + y);
				game.setScreen(new Screen1(game));
			}
		}	);

	}
	@Override
	public void render() {
		Gdx.gl.glClearColor(0.18f,0.21f,0.27f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
		stage.draw();
	}
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub

		return false;
	}
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub

		return false;
	}
	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub

	}
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}
}