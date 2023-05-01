/**
 * 
 */
package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

/**
 * @author raulp
 *
 */
public class AppGamingBasicJava {

    /**
     * @param args
     */
    public static void main(String[] args) { 
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }

}
