

// used to convey the value of each card drawn,
// manages its position in the decks of player/deck
public class Card {
  private String raw;
  private int index;
  private int val;

  // init
  public Card(int index, Deck dk) {
    this.index = index;
    raw = dk.getRaw(index);
    val = dk.getVal(index);
  }

  // GETTERS/SETTERS
  public int getIndex() { return index; }
  public void setIndex(int index) { this.index = index; }

  public int getVal() { return val; }
  public void setVal(int val) { this.val = val; }
  
}