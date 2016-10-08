/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
/**
 *
 * @author inman
 */
public class GameScreen extends ScreenAdapter {
    private PacmanGame pacmangame;
    private Texture pacmanImg;
    private Pacman pacman;
    World world;
    WorldRenderer worldRenderer;
    
    public GameScreen(PacmanGame pacmangame){
        this.pacmangame = pacmangame;
        pacmanImg = new Texture("pacman.png");
        world = new World(pacmangame);
        pacman = world.getPacman();
        worldRenderer = new WorldRenderer(pacmangame, world);
    }
    
    @Override
    public void render(float delta){
        update(delta);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
    }
    
    private void update(float delta){
        pacman.setNextDirection(pacman.DIRECTION_STILL);
        if(Gdx.input.isKeyPressed(Keys.UP)){
            pacman.setNextDirection(pacman.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)){
            pacman.setNextDirection(pacman.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)){
            pacman.setNextDirection(pacman.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)){
            pacman.setNextDirection(pacman.DIRECTION_LEFT);
        }
        world.update(delta);
    }
}
