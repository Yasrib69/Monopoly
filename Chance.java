/**
 * Project Title: Monopoly Junior
 * Author: Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * This class represents the "Chance" space on the Monopoly Junior board. When a player 
 * lands on this space, they draw a random Chance card, which may provide bonuses or penalties.
 */
import java.util.Random;

public class Chance extends BoardSpace {
    private static String[] cards = {
        "Advance to GO",
        "Pay $2 fine",
        "Collect $2 from the bank",
        "Go to Jail"
    };

    public Chance() {
        super("Chance");
    }

    @Override
    public void onLanding(Player player) {
        Random random = new Random();
        String card = cards[random.nextInt(cards.length)];
        System.out.println(player.getName() + " drew a Chance card: " + card);

        switch (card) {
            case "Advance to GO":
                player.setPosition(0);
                player.updateCash(2);
                break;
            case "Pay $2 fine":
                player.updateCash(-2);
                break;
            case "Collect $2 from the bank":
                player.updateCash(2);
                break;
            case "Go to Jail":
                player.setPosition(6); // Assuming Jail is at position 6
                break;
        }
    }
}
