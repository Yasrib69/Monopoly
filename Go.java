/**
 * Project Title: Monopoly Junior
 * Author: Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * This class represents the "GO" space on the Monopoly Junior board. Players collect $2 
 * when they land on or pass this space.
 */
public class Go extends BoardSpace {
    public Go() {
        super("GO");
    }

    @Override
    public void onLanding(Player player) {
        player.updateCash(2);
        System.out.println(player.getName() + " landed on GO! Collected $2.");
    }
}
