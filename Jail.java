public class Jail extends BoardSpace {
    public Jail() {
        super("Jail");
    }

    @Override
    public void onLanding(Player player) {
        System.out.println(player.getName() + " is in Jail! Pay $1 to get out next turn.");
        player.updateCash(-1);
    }
}
