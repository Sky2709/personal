package OOPS.GAME;

public class GameTest {
    public static void main(String[] args) {
       /* Player p1= new Player("Akash");
        Player p2= new Player("Rohan");
        p1.makeGuess();
        p2.makeGuess();*/
      Game tournament= new Game("Ravi", "Sai", "Akash");
      tournament.start();
    }
}
