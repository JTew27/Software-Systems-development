import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class test {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(line);
    Scanner scanner = new Scanner(System.in);
      
    Map<String, String> RMap = new HashMap<String, String>();
      
      while(scanner.hasNextLine()){
        line = scanner.nextLine();
        
        String[] split = line.split("|");
        System.out.println(split);
        
        if (split.length == 2){
          String part1 = split[0];
          String part2 = split[1];
          RMap.put(part1,part2);
        }
      }
    }
  }
}
