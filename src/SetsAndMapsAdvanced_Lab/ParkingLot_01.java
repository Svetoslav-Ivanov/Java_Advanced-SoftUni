package SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        String input = scan.nextLine();
        while (!input.equals("END")) {
            String[] inputAsArray = input.split(", ");
            if (inputAsArray[0].equals("IN")) {
                cars.add(inputAsArray[1]);
            } else {
                cars.remove(inputAsArray[1]);
            }
            input = scan.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        }

        System.out.println(cars.iterator());

    }
}
