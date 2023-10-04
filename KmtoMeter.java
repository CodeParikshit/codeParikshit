import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N % 2 == 0 && N > 2 && N < 5)
            System.out.println("Not Weird");
        else if (N % 2 == 0 && N == 6 && N > 20)
            System.out.println("Weird");
        System.out.println("Not Weird");
        sc.close();
    }
}
