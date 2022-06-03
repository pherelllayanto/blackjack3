import java.util.Random;
import java.util.Arrays;

// deck of cards with functions, this stuff is mostly imported from BlackJack.java
public class Deck {
  
  private static final String[] SUITES    = {"♠","♥","♦","♣"};
  private static final String[] SPECIALS  = {"A","J","Q","K"};
  private static final int      BASE      = 9; 
  private static final int      DECK_SIZE = (SPECIALS.length + BASE) * SUITES.length;
  private static final int      HAND_SIZE = 5;
  
  private static final Random   SHUFFLER  = new Random();
  private static /*f*/ String[] DECK      = shuffle(DECK_SIZE);

  // init
  public Deck() {}
  
  /*
    METHODS FROM OG BLACKJACK FILE!!!
  */

  // shuffle the deck
  public static String[] shuffle(int size) {
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
  public static String makeCard(int seed){
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    return SUITES[s] + val;
  }

  // deals card from itself(deck obj)
  public static String dealCard(){
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

  // GETTER METHOD(S?)!!!!
  public String[] getDeck() { return DECK; }
  
  public int getVal(int index) {
    String target = DECK[index];
    return Integer.parseInt(target.substring(1));
  }

  public String getRaw(int index) {
    return DECK[index];
  }
}