package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayDeque<Integer> numbers = new ArrayDeque<>();

    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
        String command = scan.next();
        switch (command) {
            case "1":
                numbers.push(scan.nextInt());
                break;
            case "2":
                numbers.pop();
                break;
            case "3":
                System.out.println(Collections.max(numbers));
                break;
        }
    }

}
}
