/**
 * Project Title: Monopoly Junior
 * Author: Yasrib Yasir Farook
 * Submission Date: 11/11/2024
 * 
 * Class Description:
 * This class represents a property space on the Monopoly Junior board. It handles property 
 * ownership, rent collection, and provides methods to check if the owner holds all properties 
 * of a specific color group, which doubles the rent.
 */
public class Property extends BoardSpace {
    private int cost;
    private int rent;
    private String color;
    private Player owner;

    public Property(String name, int cost, int rent, String color) {
        super(name);
        this.cost = cost;
        this.rent = rent;
        this.color = color;
        this.owner = null;
    }

    @Override
    public void onLanding(Player player) {
        if (owner == null) {  // Property is unowned
            if (player.getCash() >= cost) {
                player.updateCash(-cost);
                owner = player;
                System.out.println(player.getName() + " bought " + name + " for $" + cost);
            } else {
                System.out.println(player.getName() + " cannot afford " + name);
            }
        } else if (owner != player) {  // Property is owned by another player
            int payment = rent;
            if (ownerOwnsColorSet()) {
                payment *= 2; // Double rent if owner has both properties of the color set
            }
            player.updateCash(-payment);
            owner.updateCash(payment);
            System.out.println(player.getName() + " paid $" + payment + " rent to " + owner.getName());
        }
    }

    private boolean ownerOwnsColorSet() {
        return false;  // Placeholder for actual implementation
    }
}
