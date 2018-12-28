import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count = 1;
       while (sc.hasNext()) {
           System.out.println(count + " " + sc.nextLine());
           ++count;
       }
       sc.close();
    }
}

// https://www.hackerrank.com/challenges/java-end-of-file/problem
