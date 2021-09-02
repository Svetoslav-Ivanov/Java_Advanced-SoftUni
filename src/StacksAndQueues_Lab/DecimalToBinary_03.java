package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();
    int number = Integer.parseInt(scan.nextLine());

    if (number == 0){
        System.out.println(0);
        return;
    }

    while (number > 0) {
        binaryNumber.push(number % 2);
        number /= 2;
    }

    while (!binaryNumber.isEmpty()) {
        System.out.print(binaryNumber.pop());
    }

}
}
