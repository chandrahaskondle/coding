import java.io.*;
import java.util.*;

public class Solution {
  private final Scanner scanner;
  public static void main(String args[]){
    scanner = new Scanner(System.in);
    String inputFilename = scanner.nextLine();
    File outputFile = new File("result- "+filename);
    if (!outputFile.exists()) {
	    outputFile.createNewFile();
	  }
    BufferedReader br = new BufferedReader(new FileReader(inputFilename));
    BufferedWriter bw = new BufferedReader(new FileWriter(outputFile));
    while( (eachLine = br.readLine()) != null){
      // copy file contents to new file
      bw.write(eachLine);
      bw.newLine();
    }
    br.close();
    bw.close();
  }
}
