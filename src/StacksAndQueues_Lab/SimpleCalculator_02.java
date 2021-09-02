package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator_02 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] input = scan.nextLine().split("\\s+");

    ArrayDeque<String> stack = new ArrayDeque<>(Arrays.asList(input));


    while (stack.size() > 1) {
        int first = Integer.parseInt(stack.pop());
        String operator = stack.pop();
        int second = Integer.parseInt(stack.pop());

        if (operator.equals("+")){
            stack.push(String.valueOf(first+second));
        } else {
            stack.push(String.valueOf(first-second));
        }
    }

    System.out.println(stack.pop());

}
}
