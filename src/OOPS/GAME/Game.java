package OOPS.GAME;

public class Game {
      private int expectGuess;
      Player p1,p2,p3;
      Game(String name1, String name2, String name3){
          p1= new Player(name1);
          p2= new Player(name2);
          p3= new Player(name3);
      }
      boolean checkWinner(){
          if (p1.guess==expectGuess){
              System.out.println(p1.name + " Wins");
              return true;
          }
      else if (p2.guess==expectGuess){
              System.out.println(p2.name + " Wins");
              return true;
          }
      else if (p3.guess==expectGuess){
              System.out.println(p3.name + " Wins");
              return true;
          }
      return  false;
      }
    void start(){

            while(true){
                expectGuess= (int)(Math.random()*10);
                System.out.println("Number to guess: " + expectGuess);
                p1.makeGuess();
                p2.makeGuess();
                p3.makeGuess();

                if (checkWinner()){
                    break;
                }
        }

    }

}
