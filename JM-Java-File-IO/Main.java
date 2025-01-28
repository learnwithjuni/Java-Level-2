import java.io.*;
import java.util.*;

// Important: Remember the imports, and remember to add "throws IOException" to the main() method

class Main {
  public static void main(String[] args) throws IOException {
    // File Input Example 1:
    // Reading in one piece of data per line

    // Note: In USACO, the first line will always tell you the number of subsequent lines you need to read in

    // 1. open the file
    BufferedReader br = new BufferedReader(new FileReader("in1.in"));

    // 2. read in the first line and convert to int
    int N = Integer.parseInt(br.readLine());

    // 3. create array of size N to store data
    int[] nums = new int[N];

    // 4. read in the remaining lines
    for (int i = 0; i < N; i++) {
      nums[i] = Integer.parseInt(br.readLine());
    }

    // 5. close file
    br.close();



    // File Input Example 2:
    // Reading in multiple pieces of data per line

    // Note: In this case, the first line will tell you the number of lines and the number of numbers in each line

    // 1. open the file
    br = new BufferedReader(new FileReader("in2.in"));

    // 2. create a StringTokenizer object to read in the first line of data
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 3. get the two numbers from the first line
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    // 3. create array of size NxM to store data
    int[][] nums2 = new int[n][m];

    // 4. read in the remaining lines. note that you only want to update the StringTokenizer once per line of data
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        nums2[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 5. close file
    br.close();



    // File Output Example:

    // 1. open the file
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.out")));
    
    // 2. write to file
    pw.write("test\n");

    // 3. close file
    pw.close();
  }
}