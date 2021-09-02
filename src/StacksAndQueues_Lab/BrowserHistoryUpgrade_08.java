package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String navigation = scan.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String currentURL = null;
        while (!navigation.equals("Home")) {
            if (navigation.equals("back")) {
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    navigation = scan.nextLine();
                    continue;
                } else {
                    stack.push(currentURL);
                    currentURL = browserHistory.pop();
                }

            } else if (navigation.equals("forward")) {
                if (stack.isEmpty()) {
                    System.out.println("no next URLs");
                    navigation = scan.nextLine();
                    continue;
                } else {
                    currentURL = stack.pop();
                }
            } else {
                if (currentURL != null) {
                    browserHistory.push(currentURL);
                }
                currentURL = navigation;
            }

            System.out.println(currentURL);

            navigation = scan.nextLine();
        }
    }
}