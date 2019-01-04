package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class Screen1 implements Screen {
    Stage stage;
//    MyGdxGame h;
    TextButton.TextButtonStyle reply_style;
    BitmapFont font;
    public Screen1(Game game)
    {
        System.out.println("Control in Screen1");
        stage = new Stage();
        Sprite sp_button =  new Sprite(new TextureRegion(new Texture("whats-app_active.jpg")));
        Sprite sp_button_active =  new Sprite(new TextureRegion(new Texture("whats-app_active.jpg")));
        reply_style = new TextButton.TextButtonStyle(new TextureRegionDrawable(sp_button),new TextureRegionDrawable(sp_button_active),null,font);
        Gdx.input.setInputProcessor(stage);
    }


    @Override
    public void render(float delta) {
        // TODO Auto-generated method stub
        Gdx.gl.glClearColor(1,0.21f,0.27f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        super.render();
        stage.draw();
    }
    @Override
    public void resize(int width, int height) {
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

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

}