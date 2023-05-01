/**
 * 
 */
package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

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
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }

}
