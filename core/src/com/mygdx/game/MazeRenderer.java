/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author inman
 */
public class MazeRenderer {
    private Maze maze;
    private SpriteBatch batch;
    private Texture wallImage;
    private Texture dotImage;
    
    public MazeRenderer(SpriteBatch batch, Maze maze){
        this.maze = maze;
        this.batch = batch;
        wallImage = new Texture("wall.png");
        dotImage = new Texture("dot.png");
    }
    
    public void render(){
        batch.begin();
        for(int r=0; r<maze.getHeight(); r++){
            for(int c=0; c<maze.getWidth(); c++){
                int x = c * 40;
                int y = PacmanGame.HEIGHT - (r * 40) - 40;
                
                if(maze.hasWallAt(r, c)){
                    batch.draw(wallImage, x, y);
                }
                else if(maze.hasDotAt(r, c)){
                    batch.draw(dotImage, x, y);
                }
            }
        }
        batch.end();
    }
}
