package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_06 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String parentheses = scan.nextLine();
    if (parentheses.length() == 1){
        System.out.println("NO");
        return;
    }

    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < parentheses.length() / 2; i++) {
        stack.push(parentheses.charAt(i));
    }

    ArrayDeque<Character> queue = new ArrayDeque<>();
    for (int i = (int) Math.round((double) parentheses.length() / 2); i < parentheses.length(); i++) {
        switch (parentheses.charAt(i)) {
            case '}':
                queue.offer('{');
                break;
            case ')':
                queue.offer('(');
                break;
            case ']':
                queue.offer('[');
                break;
            case '{':
                queue.offer('}');
                break;
            case '(':
                queue.offer(')');
                break;
            case '[':
                queue.offer(']');
                break;

            default:
                System.out.println("NO");
                return;
        }

    }

    while ((!stack.isEmpty()) && (!queue.isEmpty())) {
        if (stack.pop() != queue.poll()) {
            System.out.println("NO");
            return;
        }
    }
    System.out.println("YES");

}

}
