

import java.io.FileReader;
import java.io.IOException;

public class Mo6 {
  public static void main(String[] args) {
    if (args.length == 1) {
      try {
        FileReader in = new FileReader(args[0]);
        int c;
        while ((c = in.read()) != -1) {
          System.out.print((char)c);
        }
        in.close();
      } catch(IOException e) {
        System.err.println(e);
      }
    } else {
      System.err.println("usage: java cat1 filename");
    }
  }
}






