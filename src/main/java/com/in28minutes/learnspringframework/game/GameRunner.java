/**
 * 
 */
package com.in28minutes.learnspringframework.game;

/**
 * @author raulp
 *
 */
public class GameRunner {

    MarioGame game;

    public GameRunner(MarioGame game) {
        super();
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
