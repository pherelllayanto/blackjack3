import java.util.Random;
import java.util.Arrays;

// deck of cards with functions, this stuff is mostly imported from BlackJack.java

/* PERHAPS 6-8 DECKS POSSIBLE???? */

public class Deck {
  
  private final String[] SUITES    = {"♠","♥","♦","♣"};
  private final String[] SPECIALS  = {"A","J","Q","K"};
  private final int      BASE      = 9; 
  private final int      DECK_SIZE = (SPECIALS.length + BASE) * SUITES.length;
  private final int      HAND_SIZE = 5;
  
  private final Random   SHUFFLER  = new Random();
  private /*f*/ String[] DECK      = shuffle(DECK_SIZE);
  private String NAME;

  // init
  public Deck(String NAME) { 
    this.NAME = NAME; 
  }
  

  // shuffle the deck
  public String[] shuffle(int size) {
    String[] deck = new String[size];
    for(int i = 0; i < size; i++){
      int r = SHUFFLER.nextInt(size);
      String card = makeCard(i);
      deck[i] = makeCard(r);
      deck[r] = card;
    }
    
    System.out.println();
    System.out.println("THE CARDS ARE SHUFFLED!");
    
    return deck;
  }

  // produce card for init deck
  public String makeCard(int seed){
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    return SUITES[s] + val;
  }

  // deals card from itself(deck obj)
  public String dealCard(){
    String card = "";
    for(int i = 0; i < DECK.length; i++){
      card = DECK[i];
      if(DECK.length > 0){
        DECK[i] = "";
        return card;
      }
    }
    return card;
  }

  // deals to any player/dealer hand
  public void addCard(String[] hand){
    for(int i =0; i < hand.length; i++) {
      if(hand[i] == null){
        hand[i] = dealCard();
        break;
      }
    }
  }

  
  // GETTER METHODS!!!!!!!
  public String[] getDeck() { return DECK; }
  
  public int getVal(int index) {
    String target = DECK[index];
    return Integer.parseInt(target.substring(1));
  }

  public String getRaw(int index) {
    return DECK[index];
  }

  
}