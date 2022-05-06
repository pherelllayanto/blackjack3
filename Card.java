public class Card {
  
  String rawVal;
  String val;
  String suite;
  int num;
  int id;
  
  static String[] SPECIALS = {"A","J","Q","K"};
  static String[] SUITES = {"♠","♥","♦","♣"};
  static int      BASE = 9;
  

  public Card(int seed) {  
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);
    this.num = n + 1;
    this.id = seed;

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    this.suite = SUITES[s];
    this.val = val;
    
  }

  public String toString() {
    return this.suite + this.val;
  }
}