package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayDeque<String> queue = new ArrayDeque<>();

    String input = scan.nextLine();
    while (!input.equals("print")){
        if (input.equals("cancel")){
            if (queue.isEmpty()){
                System.out.println("Printer is on standby");
            } else  {
                System.out.println("Canceled " + queue.poll());
            }
        } else {
            queue.offer(input);
        }
        input = scan.nextLine();
    }

    while (!queue.isEmpty()){
        System.out.println(queue.poll());
    }
}
}
