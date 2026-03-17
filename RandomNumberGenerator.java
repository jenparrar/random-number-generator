import java.util.Random;

public class RandomNumberGenerator {

    // This method generates a random number between 1 and 100
    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Random number: " + randomNumber);
    }
}
