/**
 * Project Title: Monopoly Junior
 * Author: Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * This class is the main entry point for the Monopoly Junior game. It manages the game loop,
 * player turns, and game-ending conditions. It also announces the winner at the end.
 */
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the players
            ArrayList<Player> players = new ArrayList<>();
            players.add(new Player("Toy Boat", 16));
            players.add(new Player("Toy Car", 16));
            players.add(new Player("Little Hazel", 16));
            players.add(new Player("Little Scottie", 16));

            // Initialize the game board and die
            GameBoard board = new GameBoard();  // Direct instantiation
            Die die = new Die();

            // Randomly choose a starting player
            Random random = new Random();
            int currentPlayerIndex = random.nextInt(players.size());
            System.out.println(players.get(currentPlayerIndex).getName() + " will start the game!");

            boolean gameOver = false;
            int turn = 1;

            while (!gameOver) {
                System.out.println("\nTurn " + turn + ":");

                // Get the current player
                Player currentPlayer = players.get(currentPlayerIndex);

                // Player rolls the die and moves
                int roll = die.roll();
                System.out.println(currentPlayer.getName() + " rolled a " + roll);
                currentPlayer.setPosition(currentPlayer.getPosition() + roll);

                // Get the new space and apply its effects
                BoardSpace space = board.getSpace(currentPlayer.getPosition());
                space.onLanding(currentPlayer);

                // Check for bankruptcy
                if (currentPlayer.isBankrupt()) {
                    System.out.println(currentPlayer.getName() + " is bankrupt! Game over.");
                    gameOver = true;
                    break;
                }

                // Move to the next player in a round-robin fashion
                currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
                turn++;
            }

            // Determine the winner based on the final cash balance
            Player winner = players.get(0);
            for (Player player : players) {
                if (player.getCash() > winner.getCash()) {
                    winner = player;
                }
            }

            // Display the final standings and the winner
            System.out.println("\nGame Over! Final Cash Balances:");
            for (Player player : players) {
                System.out.println(player.getName() + ": $" + player.getCash());
            }
            System.out.println("Winner: " + winner.getName() + " with $" + winner.getCash());

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
