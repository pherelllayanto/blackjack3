import java.util.*;

// manages player stuffs
public class Player {
  
  protected String            name;
  protected int               wins;
  protected int               losses;
  protected double /* $ */    cash;
  protected int               score;
  protected UUID              id;
  protected ArrayList<String> hand;
  protected Scanner           scn;
  
  public Player(String name) {
    this.name = name;
    wins = 0; losses = 0; cash = 100; score = 0;
    id = UUID.randomUUID();
    hand = new ArrayList<String>();
    scn = new Scanner(System.in);
  }

  // METHODS (BLACKJACK)

  // gets total of hand
  public int getTotal(){
    int sum = 0;
    for(String c : hand) {
      sum += Integer.valueOf(c.substring(1));
    }
    return sum;
  }

  // prints hand info of player
  public void printHand(){
    String cards = "";
    String score = " total: " + getTotal();
    for(String c : hand){
      if(c != null) cards += "["+hand.get(hand.indexOf(c))+"] ";
      else cards += "     ";
    }
    System.out.println("  " +  cards + score);   
  }

  // asks bet, might be GAME???
  public static int whatToBet(Scanner scn){
    System.out.print("  How much will you bet? ");
    return scn.nextInt();
  }

  // GETTERS/SETTERS
  public String getName() { return name; }
  public int getWin() { return wins; }
  public int getLoss() { return losses; }
  public double getCash() { return cash; }
  public int getScore() { return score; }
  public UUID getUUID() { return id; }
  
}