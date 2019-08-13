
public class Main {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        // The guessing range can be specified below. By default, it is 1-100.
        game.play(1,100);
    }    
}
