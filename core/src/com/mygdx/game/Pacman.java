/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author inman
 */
public class Pacman {
    private Vector2 position;
    
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    public static final int SPEED = 10;
    
    private static final int [][] DIR_DIFF = new int[][]{
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };
    
    public Pacman (int x, int y){
        position = new Vector2(x, y);
    }
    
    public Vector2 getPosition(){
        return position;
    }
    
    public void move(int dir){
        position.x += SPEED * DIR_DIFF[dir][0];
        position.y += SPEED * DIR_DIFF[dir][1];
    }
}
