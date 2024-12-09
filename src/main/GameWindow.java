package main;

import javax.swing.*;

// creates the game window
public class GameWindow {
    // Konstructor
    private JFrame jFrame;
    public GameWindow(GamePanel gamePanel) {
        jFrame = new JFrame();

        // Window size
        jFrame.setSize(400, 400);
        // set the programm to terminate when Window is closed
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        // set the Window to be visible (localtion is important!)
        jFrame.setVisible(true);
    }
}
