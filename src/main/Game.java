package main;

public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    // Konstruktor
    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        // give focus to GamePanel so that inputs are read by this class
        gamePanel.requestFocus();
    }
}
