package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String navigation = scan.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String currentURL = null;
        while (!navigation.equals("Home")) {
            if (navigation.equals("back")) {
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    navigation = scan.nextLine();
                    continue;
                } else {
                    currentURL = browserHistory.pop();
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
