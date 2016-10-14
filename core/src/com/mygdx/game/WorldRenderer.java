/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author inman
 */
public class WorldRenderer {

    public static final int BLOCK_SIZE = 40;
    private PacmanGame pacmanGame;
    private SpriteBatch batch;
    private Texture pacmanImg;
    private Pacman pacman;  
    private BitmapFont font;
    
    World world;
    
    private MazeRenderer mazeRenderer;
    
    public WorldRenderer(PacmanGame pacmanGame, World world){
        this.pacmanGame = pacmanGame;
        
        this.world = world;
          
        pacmanImg = new Texture("pacman.png");
        pacman = world.getPacman();
        
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
        font = new BitmapFont();
    }
    
    public void render(float delta){
        mazeRenderer.render();
        
        batch = pacmanGame.batch;
        batch.begin();
        Vector2 pos = world.getPacman().getPosition();
        batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, PacmanGame.HEIGHT - pos.y - BLOCK_SIZE/2);
        font.draw(batch, "" + world.getScore(), 700, 60);
        batch.end();
    }
}
