import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    private static boolean flag = true;
    private static final Scanner scanner = new Scanner(System.in);
    private static int B = 0;
    private static int H = 0;
    // https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
    static {
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
    }

    public static void main(String[] args){
        if(flag) {
            int area= B * H;
            System.out.print(area);
        }
    }

}

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
