/*
In order to use standard input and output in Java (instead of reading in a file and writing to a file), we just make some small changes, described below.
*/

import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {

    // Read input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // You can use the BufferedReader normally from here going forward (e.g. call br.readLine() inside of a loop, use the StringTokenizer, etc.)! To test your code, after you Run, paste in the input into the console.

    // Output result
    System.out.print("this is the answer");

    // Reminder: make sure to remove any extra printing in your file!

  }
}