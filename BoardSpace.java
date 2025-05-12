/**
 * Project Title: Monopoly Junior
 * Author: Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * Abstract base class for all spaces on the Monopoly Junior board. It defines the 
 * structure for different types of spaces by including an abstract method onLanding, 
 * which is implemented in each specific space type.
 */
public abstract class BoardSpace {
    protected String name;

    public BoardSpace(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // Abstract method to be implemented by subclasses
    public abstract void onLanding(Player player);
}
