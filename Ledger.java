import java.io.*;
import java.util.*;

public class Ledger {
  
  public File f;
  public Scanner scn;
  public PrintStream ps;

  public Ledger() throws FileNotFoundException {
    this.f = new File("ledger.csv");
    this.ps = new PrintStream(f);
    
  }

  public void addPlayer(UUID id, String name) {
    ps.printf("%s %s", name, id.toString());
    ps.println();
  }

  public void initScanner() throws FileNotFoundException {
    this.scn = new Scanner(f);
  }

}