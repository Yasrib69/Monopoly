/**
 * Project Title: Monopoly Junior
 * Author: Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * This class represents the game board for Monopoly Junior. It initializes all board spaces 
 * and provides methods to access spaces based on the player's position. It also helps manage 
 * property ownership by color group.
 */
public class GameBoard {
    private BoardSpace[] spaces;

    public GameBoard() {
        spaces = new BoardSpace[24];

        // Initialize each space with specific types
        spaces[0] = new Go();
        spaces[1] = new Property("Burger Joint", 1, 1, "Brown");
        spaces[2] = new Chance();
        spaces[3] = new Property("Pizza House", 1, 1, "Brown");
        spaces[4] = new Jail();
        spaces[5] = new Property("Ice Cream Parlor", 2, 1, "Light Blue");
        spaces[6] = new Property("Candy Store", 2, 1, "Light Blue");
        spaces[7] = new Chance();
        spaces[8] = new Property("Library", 2, 1, "Pink");
        spaces[9] = new Property("Museum", 2, 1, "Pink");
        spaces[10] = new FreeParking();
        spaces[11] = new Property("Swimming Pool", 3, 2, "Orange");
        spaces[12] = new Property("Skate Park", 3, 2, "Orange");
        spaces[13] = new Chance();
        spaces[14] = new Property("Video Arcade", 3, 2, "Red");
        spaces[15] = new Property("Movie Theater", 3, 2, "Red");
        spaces[16] = new Jail();
        spaces[17] = new Property("Toy Store", 3, 2, "Yellow");
        spaces[18] = new Property("Pet Store", 3, 2, "Yellow");
        spaces[19] = new Chance();
        spaces[20] = new Property("Bowling Alley", 4, 3, "Green");
        spaces[21] = new Property("Zoo", 4, 3, "Green");
        spaces[22] = new Property("Park Place", 5, 4, "Dark Blue");
        spaces[23] = new Property("Boardwalk", 5, 4, "Dark Blue");
    }

    public BoardSpace getSpace(int position) {
        return spaces[position % spaces.length];
    }

    
}
