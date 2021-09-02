package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato_07 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] children = scan.nextLine().split("\\s+");
    ArrayDeque<String> queue = new ArrayDeque<>();

    for (String child : children) {
        queue.offer(child);
    }


    int n = Integer.parseInt(scan.nextLine());

    int cycle = 1;
    int primesCount = queue.size() - 1;
    while (queue.size() > 1) {
        for (int i = 1; i < n; i++) {
            queue.offer(queue.poll());
            if (cycle <= primesCount) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

    }
    System.out.println("Last is " + queue.poll());
}
}
