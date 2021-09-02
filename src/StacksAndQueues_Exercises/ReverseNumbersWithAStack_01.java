package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayDeque<String> input = new ArrayDeque<>();
    Arrays.stream(scan.nextLine().split("\\s+")).forEach(input::push);

    input.forEach(e -> System.out.print(e + " "));
}
}
