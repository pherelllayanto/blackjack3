import java.util.ArrayList;
import java.util.Scanner;

// manages player stuffs
public class Player {
  
  protected String name;
  protected int wins;
  protected int losses;
  protected double /* $ */ cash;
  /* RESETTING */ protected int score;
  protected ArrayList<Card> hand = new ArrayList<Card>();
  protected Scanner scn = new Scanner(System.in);
  
  public Player(String name) {
    this.name = name;
    wins = 0; losses = 0; cash = 100; score = 0;
  }

  // METHODS (BLACKJACK)

  // gets total of hand
  public int getTotal(){
    int sum = 0;
    for(Card c : hand) {
      sum += c.getVal();
    }
    return sum;
  }

  // prints hand info of player
  public void printHand(){
    String cards = "";
    String score = " total: " + getTotal();
    for(Card c : hand){
      if(c != null) cards += "["+c.getRaw()+"] ";
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
  
}