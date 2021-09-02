package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics_05 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] robotsAsArray = scan.nextLine().split(";");
    Map<String, Integer> robotsData = getAsMap(robotsAsArray);

    ArrayDeque<String> products = new ArrayDeque<>();

    String[] timeAsArray = scan.nextLine().split(":");
    long timeInSeconds = Long.parseLong(timeAsArray[0]) * 60 * 60
            + Long.parseLong(timeAsArray[1]) * 60
            + Long.parseLong(timeAsArray[2]);

    String product = scan.nextLine();
    while (!product.equals("End")) {
        products.offer(product);
        product = scan.nextLine();
    }

    int[] currentProcessingTime = new int[robotsData.size()];

    while (!products.isEmpty()) {
        String currentProduct = products.poll();
        int index = 0;
        timeInSeconds++;
        boolean noFreeRobot = true;
        for (Map.Entry<String, Integer> robot : robotsData.entrySet()) {
            if (currentProcessingTime[index] == 0) {
                System.out.printf("%s - %s [%s]%n",
                        robot.getKey(), currentProduct,
                        getTimeFormat(timeInSeconds));
                currentProcessingTime[index] = robot.getValue();
                noFreeRobot = false;
                break;
            }
            index++;
        }
        if (noFreeRobot) {
            products.offer(currentProduct);
        }

        for (int i = 0; i < currentProcessingTime.length; i++) {
            if (currentProcessingTime[i] >0){
                currentProcessingTime[i]--;
            }
        }


    }

}


    private static LinkedHashMap<String, Integer> getAsMap(String[] robotsAsArray) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robot : robotsAsArray) {
            int processingTime = Integer.parseInt(robot.split("-")[1]);
            robots.put(robot.split("-")[0], processingTime);
        }
        return robots;
    }

    private static String getTimeFormat(long a) {
        int hours = (int) a / 60 / 60;
        if (hours>=24){
            hours %= 24;
        }
        int minutes = (int) a / 60 % 60;
        int seconds = (int) a % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }

}
