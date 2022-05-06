// Pherell Layanto
// 4/ /22
// 8: BlackJack (Part 3)
// Period 4

/*
  OOP Blackjack
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class BlackJack {
  static final String[] SUITES    = {"♠","♥","♦","♣"};
  static final String[] SPECIALS  = {"A","J","Q","K"};
  static final int      BASE      = 9; 
  static final int      DECK_SIZE = (SPECIALS.length + BASE) * SUITES.length;
  static final int HAND_SIZE      = 5;
  
  static final Random   SHUFFLER  = new Random();
  static /*f*/ String[] DECK      = shuffle(DECK_SIZE);

  
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    
    String[] player = new String[HAND_SIZE];
    String[] dealer = new String[HAND_SIZE];
    
    int bet = setup(scn, dealer, player);


    
    // MAKE A CARD TYPE
    Card card1 = new Card(3);
    System.out.println(card1.toString());
    System.out.println(card1.id);
    // MAKE A CARD TYPE


    
    // player plays...
    inPlay(scn, player, false);
    // dealer plays...
    inPlay(scn, dealer, true);
    
    showWinner(bet, player, dealer);

  
    
    scn.close();
  }

  public static void inPlay(Scanner scn, String[] hand, boolean dealer){
    printHandIntro(hand, dealer);

  }
  
  public static void showWinner(int bet, String[] player, String[] dealer){
    System.out.println();
    System.out.println("--------------------------------------");
    if(false){
      System.out.println("  You win!!! $");
    }
    else
      System.out.println("  You LOOSE!!! $");
    System.out.println("--------------------------------------");
    System.out.println();
  }
  
 
  public static void printHandIntro(String[] hand, boolean dealer){
    System.out.println();
    System.out.println("--------------------------------------");
    System.out.println(((dealer)?"  Dealer" : "  Player") + " plays...");
    System.out.println("--------------------------------------");
    System.out.println();
    printHand(hand);
  }
  
  public static int getTotal(String[] hand){
    return 0;
  }
  
  public static void addCard(String[] player){
    for(int i =0; i < player.length; i++) {
      if(player[i] == null){
        player[i] = dealCard(DECK);
        break;
      }
    }
  }
  
  public static int setup(Scanner scn, String[] dealer, String[] player){
    useTest(scn);
    System.out.println();
    System.out.println("--------------------------------------");
    System.out.println("  Let's play Blackjack!");
    System.out.println("--------------------------------------");
    System.out.println();
    
    int bet = whatToBet(scn); 
    for(int i = 0; i < 2; i++){
      addCard(player);
      addCard(dealer);
    }
    printShow(dealer);
    
    return bet;
  }

  public static int whatToBet(Scanner scn){
    System.out.print("  How much will you bet? ");
    return scn.nextInt();
  }  

  public static void printShow(String[] hand){
    System.out.println("  Dealer shows: ["+ hand[0] +"] [  ]");
  }
  
  public static void printHand(String[] hand){
    String cards = "";
    String score = " total: " + getTotal(hand);
    for(String c:hand){
      if(c != null) cards += "["+c+"] ";
      else cards += "     ";
    }
    System.out.println("  " +  cards + score); 
    
  }
  
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
  
  public static String makeCard(int seed){
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    return SUITES[s] + val;
  }
























  
 // This makes the tests work.
  public static void useTest(Scanner scn){
    System.out.println("Want to use a test deck?" );
    System.out.print("(0:looser 1:winner or skip): ");
    String t = scn.next();
    int i = 3;
    try {i = Integer.parseInt(t);}
    catch(NumberFormatException e){}
    if(i==0 || i==1) DECK = DECK_TESTS[i];
  }

  // These are the test decks.
  static final String[][] DECK_TESTS = {
    {"♥3", "♥A", "♥9", "♠4", "♣4", "♥4", "♥5", "♦4", "♠2", "♥Q", "♣8", "♠K", "♦2", "♥2", "♣J", "♦5", "♣2", "♥K", "♠J", "♥10", "♠3", "♣3", "♣K", "♦3", "♦A", "♦K", "♥7", "♥8", "♦7", "♦J", "♦8", "♦Q", "♠6", "♣5", "♠10", "♠8", "♥6", "♣10", "♥J", "♠9", "♣9", "♦9", "♦6", "♠A", "♠Q", "♣A", "♣Q", "♦10", "♣7", "♠7", "♣6", "♠5"},
    {"♣J","♥2","♣2","♥A","♣9","♠6","♥4","♥3","♦K","♠5","♥K","♦2","♠7","♥10","♣8","♥6","♠A","♦3","♠3","♦4","♣3","♣A","♥8","♦6","♦A","♠J","♦8","♠8","♥Q","♦5","♠2","♠4","♠10","♣7","♦7","♣Q","♠K","♠Q","♦10","♣5","♦Q","♣4","♣10","♥J","♥5","♦J","♦9","♥9","♥7","♣K","♠9","♣6"}
  };
}