import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

// manage blackjack games, deck, file creation/saving, players
public class Game {

  private Scanner scn;
  private Ledger mem;
  // all possible players
  private Player p1;
  private Player p2;
  private Player p3;
  private Player p4;
  private Player p5;
  private Player p6;
  private Player p7;
  
  
  
  public Game() {
    scn = new Scanner(System.in);
    mem = new Ledger();
  }

  // on start stuff
  public void setup() {
    System.out.println("Welcome to BlackJack!");
    System.out.println("How many players?(1-7) : ");
    String pNum = scn.nextLine();
    if()
    System.out.println("How many decks? : ");
    
  }
  
}