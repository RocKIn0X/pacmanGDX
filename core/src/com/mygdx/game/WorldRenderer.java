/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author inman
 */
public class WorldRenderer {

    private PacmanGame pacmanGame;
    private SpriteBatch batch;
    private Texture pacmanImg;
    private Pacman pacman;
    
    World world;
    
    private MazeRenderer mazeRenderer;
    
    public WorldRenderer(PacmanGame pacmanGame, World world){
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
        
        this.world = world;
          
        pacmanImg = new Texture("pacman.png");
        pacman = world.getPacman();
        
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
    }
    
    public void render(float delta){
        mazeRenderer.render();
        
        batch.begin();
        Vector2 pos = pacman.getPosition();
        batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
    }
}
