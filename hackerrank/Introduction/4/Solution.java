import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int END = 10;

    public static void print_by_value(int n) {
        int i;
        for (i = 1; i <= END; ++i) {
            System.out.println(n + " x " + i + " = " + i * n);
        }
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        print_by_value(N);
        scanner.close();
    }
}


// from https://www.hackerrank.com/challenges/java-loops-i/problem
