// manage/use the deck. Is an extension of player
public class Dealer extends Player {
  
  public Dealer() {
    super("Dealer");
  }

  // shows hand
  public void printShow(){
    System.out.println("  Dealer shows: ["+ hand.get(0) +"] [  ]");
  }
  
  
}