public class FreeParking extends BoardSpace {
    public FreeParking() {
        super("Free Parking");
    }

    @Override
    public void onLanding(Player player) {
        System.out.println(player.getName() + " is just taking a break at Free Parking.");
    }
}
