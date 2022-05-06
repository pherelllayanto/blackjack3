import java.util.*;
import java.io.*;

public class Player {

  private String name;
  private double cash;
  private UUID id = UUID.randomUUID();
  private File f;
  private PrintStream p;
  private Scanner scn;

  public Player(String name, double cash, boolean createFile) throws FileNotFoundException {
      this.scn = new Scanner(f);
      this.p = new PrintStream(f);
      this.name = name;
      this.cash = cash;
    
  }

  public double bet(double amount) {
    this.cash -= amount;
    return amount;
  }

  public String getName() {
    return name;
  }

  public double getCash() {
    return cash;
  }

  public void write(String msg) {
    this.p.println(msg);
  }

}