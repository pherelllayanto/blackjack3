import java.util.*;
import javax.swing.*;
import java.io.*;

// manage blackjack games, deck, file creation/saving, players
public class Game {

  private Scanner           scn;
  private Ledger            mem;
  private Player[]          players;
  private Deck[]            decks;

  public Game(Player[] players, Deck[] decks) throws FileNotFoundException, IOException {
    scn = new Scanner(System.in);
    mem = new Ledger();
    this.players = players;
    this.decks = decks;
  }

  // main
  public void main(String[] args) {
    setup();
    
  }

  // on start stuff. rest of setup A.K.A. initilizing objects in arrays
  public void setup() {
    
    for(int i = 0; i < players.length; i--) {
      System.out.println("Enter/Choose name of Player "+(i+1)+" or enter 's' to access a saved profile : " );
      if(scn.next() == "s") {
        System.out.println("Enter UUID of saved player or enter 'e' to exit : "); // decide if want UUID or name
        if(scn.next() == "e") {
          break; // I want to go back to "System.out.println(""Enter/Choose name..."
        } else {
          
        }
      } else {
        players[i] = new Player(scn.next().toString());
      }
      
    }
    
  }

}