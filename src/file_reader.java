
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class file_reader {
  public void file_analysis(String filename) throws Exception {
    File file = new File(filename);


      FileReader fr = new FileReader(file);
      BufferedReader in = new BufferedReader(fr);
      String line;
      while ((line = in.readLine()) != null)
        System.out.println(line);
    }
  }
