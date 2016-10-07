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
    
    World(PacmanGame pacmanGame){
        this.pacmanGame = pacmanGame;
        
        pacman = new Pacman(100, 100);
    }
    
    Pacman getPacman(){
        return pacman;
    }
}
