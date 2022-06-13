import java.util.*;
import javax.swing.*;
import java.io.*;

// manage blackjack games, deck, file creation/saving, players
public class Game {

  private Scanner scn;
  private Ledger mem;
  // all possible p
  // arraylist containing all possible players
  private Arraylist<Player> players = new ArrayList<Player>() { 
    {
    add(Player p1);
    add(Player p2);
    add(Player p3);
    add(Player p4);
    add(Player p5);
    add(Player p6);
    add(Player p7);
    }
  };

  public Game() {
    scn = new Scanner(System.in);
    mem = new Ledger();
  }

  // on start stuff
  public void setup() {
    System.out.println("Welcome to BlackJack!");
    System.out.println("How many players?(1-7) : ");
    String pNum = scn.nextLine();
    // if(/* */)
    System.out.println("How many decks? : ");

  }

}