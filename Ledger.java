import java.util.Scanner;
import java.util.UUID;
import java.io.*;

// records game/player data
// only one per game
public class Ledger {

  private File mem;
  private PrintWriter memWriter;
  private Scanner memReader;
  
  public Ledger() throws FileNotFoundException, IOException {
    mem = new File("mem.csv");
    memWriter = new PrintWriter(new FileWriter(mem, true));
    memReader = new Scanner(mem);
  }

  // record rnd UUID in csv file
  public void saveIdent(Player p) {
    if(mem.length() != 0) {
      memWriter.println();
    }
    memWriter.println(p.getName()+" "+p.getUUID());
  }

  /* close writer, reader */
  public void close() {
    memWriter.close();
    memReader.close();
  }
  
}