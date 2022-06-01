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
    INITILIAZE DECK ARRAY!!! (MOST OF THESE WILL BE RAN AT INIT)
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

  // produce card
  public static String makeCard(int seed){
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    return SUITES[s] + val;
  }

  // deals card from itself(deck obj)
  public static String dealCard(String[] cards){
    String card = "";
    for(int i = 0; i < cards.length; i++){
      card = cards[i];
      if(card.length() > 0){
        cards[i] = "";
        return card;
      }
    }
    return card;
  }

  // GET METHODS!!!!
  public
  
  
}