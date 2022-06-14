import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

  public static Player[] players;
  public static Deck[] decks;
  
  // scanner init
  public static Scanner scn = new Scanner(System.in);
  
  public static void main(String[] args) throws FileNotFoundException, IOException {
    infoInit();

    // new game
    Game gm = new Game(players, decks);
  }

  // does setup for size of deck/player array
  public static void infoInit() {

    // num of players
    System.out.println("Welcome to BlackJack.");
    System.out.println("Enter amount of players(int) : ");
    while(scn.nextInt() != (int)scn.nextInt()) {
      System.out.println("Please enter an integer. Enter amount of players(int) : ");
    }
    players = new Player[scn.nextInt()];

    // num of decks
    System.out.println("Enter amount of decks(int) : ");
    while(scn.nextInt() != (int)scn.nextInt()) {
      System.out.println("Please enter an integer. Enter amount of decks(int) : ");
    }
    decks = new Deck[scn.nextInt()];
  }

}