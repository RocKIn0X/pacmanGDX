/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/**
 *
 * @author inman
 */
public class GameScreen extends ScreenAdapter {
    private PacmanGame pacmangame;
    private Texture pacmanImg;
    
    public GameScreen(PacmanGame pacmangame){
        this.pacmangame = pacmangame;
        pacmanImg = new Texture("pacman.png");
    }
    
    @Override
    public void render(float delta){
        SpriteBatch batch = pacmangame.batch;
        batch.begin();
        batch.draw(pacmanImg, 100, 100);
        batch.end();
    }
}
