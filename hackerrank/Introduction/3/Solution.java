import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void print_by_value(int num) {

        if (num % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (num >= 2 && num <= 5) {
                System.out.println("Not Weird");
            } else if (num >= 6 && num <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        print_by_value(N);
        scanner.close();
    }
}


// from https://www.hackerrank.com/challenges/java-if-else/problem
