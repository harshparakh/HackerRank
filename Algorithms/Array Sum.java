import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        int a[] = new int[size];
        int sum = 0;
        for (int i = 0; i < a.length ; i++ ) {
          a[i] = in.nextInt();
          sum = sum + a[i];
        }
System.out.println(sum);
    }
}
