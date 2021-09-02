package StacksAndQueues_Exercises;

import java.util.Scanner;

public class RecursiveFibonacci_07 { public static long[] memoryForFibonacci;

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        memoryForFibonacci = new long[n + 1];
        System.out.println(getFibonacci(n));

    }

    public static long getFibonacci(int n) {

        if (n <= 1) {
            return 1;
        }

        if (memoryForFibonacci[n] != 0) {
            return memoryForFibonacci[n];
        }

        return memoryForFibonacci[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
