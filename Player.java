/**
 * Project Title: Monopoly Junior
 * Author: [Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * This class represents a player in the Monopoly Junior game. It tracks the player's name, 
 * cash balance, and position on the board. It also includes methods for updating cash and 
 * checking for bankruptcy.
 */
public class Player {
    private String name;
    private int cash;
    private int position;

    public Player(String name, int cash) {
        this.name = name;
        this.cash = cash;
        this.position = 0; // All players start at GO
    }

    public String getName() { return name; }
    public int getCash() { return cash; }
    public int getPosition() { return position; }

    public void updateCash(int amount) {
        this.cash += amount;
    }

    public void setPosition(int newPosition) {
        this.position = newPosition % 24; // Assuming 24 spaces on the board
    }

    public boolean isBankrupt() {
        return cash < 0;
    }
}
