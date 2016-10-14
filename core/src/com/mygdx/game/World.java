/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

/**
 *
 * @author inman
 */
public class World {
    private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    private int score;
    
    World(PacmanGame pacmanGame){
        maze = new Maze();
        this.pacmanGame = pacmanGame;
        pacman = new Pacman(60, 60, this);
        score = 0;
    }
    
    Pacman getPacman(){
        return pacman;
    }
    
    Maze getMaze(){
        return maze;
    }
    
    public void update(float delta){
        pacman.update();
    }
    
    public int getScore(){
        return score;
    }
    
    public void increaseScore(){
        score += 1;
    }
}
