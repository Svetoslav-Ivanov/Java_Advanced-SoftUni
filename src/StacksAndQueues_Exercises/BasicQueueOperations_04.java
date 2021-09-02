package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();// number of elements to push onto the stack
        int s = scan.nextInt(); // number of elements to pop from the stack
        int x = scan.nextInt(); // check whether is present in the stack

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            numbers.offer(scan.nextInt());
        }
        for (int i = 0; i < s; i++) {
            numbers.poll();
        }
        if (numbers.size() == 0) {
            System.out.println(0);
            return;
        }
        if (numbers.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(numbers));
        }
    }
}