/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.badlogic.gdx.ScreenAdapter;
/**
 *
 * @author inman
 */
public class GameScreen extends ScreenAdapter {
    private PacmanGame pacmangame;
    
    public GameScreen(PacmanGame pacmangame){
        this.pacmangame = pacmangame;
    }
    
    @Override
    public void render(float delta){
        System.out.println("Hello" + delta);
    }
}
