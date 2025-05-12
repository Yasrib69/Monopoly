import java.util.Random;

public class Die {
    private Random random;

    public Die() {
        random = new Random();
    }

    // Ensure that this method returns an int, not void
    public int roll() {
        return random.nextInt(6) + 1;  // Random number between 1 and 6
    }
}
