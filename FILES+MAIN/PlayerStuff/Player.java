import java.util.ArrayList;
// manages player info
public class Player {
  
  private String name;
  private int wins;
  private int losses;
  private double /* $ */ cash;
  /* RESETTING */ private int score;
  
  public Player(int name) {
    this.name = name;
    wins = 0; losses = 0; cash = 100; score = 0;
  }

  // GETTERS/SETTERS
  public String getName() { return name; }
  public int getWin() { return wins; }
  public int getLoss() { return losses; }
  public double getCash() { return cash; }
  public int getScore() { return score; }
  
}