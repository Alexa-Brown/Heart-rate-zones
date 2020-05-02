/**********************************************************************
 * @file HeartRateZones.java
 * @brief This program implements the use of if statements to give the best heart rate range for that age.
 * @author Alexa Brown
 * @date February 5, 2019
 **********************************************************************/
import java.util.Scanner;

public class HeartRateZones {
    public static void main(String[] args) {
        Scanner lulu = new Scanner(System.in);

        int age;
        int hr;
        int choice;

        System.out.println("Target Heart Rate Zone Calculator");

        System.out.println("Enter your age: ");
        age = lulu.nextInt();
        System.out.println("Enter your resting heart rate: ");
        hr = lulu.nextInt();

        System.out.println("Choose your target: ");
        System.out.println("1. Boost recovery, get ready to train at higher rates");
        System.out.println("2. Building endurance, weight loss");
        System.out.println("3. Improving cardio fitness, weight management");
        System.out.println("4. Speed endurance");
        System.out.println("5. Maximal effort, interval training");

        System.out.println("Your choice? ");
        choice = lulu.nextInt();

        if (choice == 1) {
            double estimate_max_heart_rate = 220 - age;
            double d = estimate_max_heart_rate - hr;
            double zone1low = d * 0.50 + hr;
            double zone1high = d * 0.60 + hr;
            System.out.printf("Exercise to keep your heart rate in the zone %.2f" , zone1low);
            System.out.printf(" - %.2f" , zone1high);
            System.out.println(" beats per minute.");
        }
        else if (choice == 2) {
           double estimate_max_heart_rate = 220 - age;
           double d = estimate_max_heart_rate - hr;
           double zone2low = d * 0.60 + hr;
           double zone2high = d * 0.70 + hr;
           System.out.printf("Exercise to keep your heart rate in the zone %.2f" , zone2low);
           System.out.printf(" - %.2f" , zone2high);
           System.out.println(" beats per minute.");
        }
        else if (choice == 3) {
            double estimate_max_heart_rate = 220 - age;
            double d = estimate_max_heart_rate - hr;
            double zone3low = d * 0.70 + hr;
            double zone3high = d * 0.80 + hr;
            System.out.printf("Exercise to keep your heart rate in the zone %.2f" , zone3low);
            System.out.printf(" - %.2f" , zone3high);
            System.out.println(" beats per minute.");
        }
        else if (choice == 4) {
            double estimate_max_heart_rate = 220 - age;
            double d = estimate_max_heart_rate - hr;
            double zone4low = d * 0.80 + hr;
            double zone4high = d * 0.90 + hr;
            System.out.printf("Exercise to keep your heart rate in the zone %.2f" , zone4low);
            System.out.printf(" - %.2f" , zone4high);
            System.out.println(" beats per minute.");
        }
        else if (choice == 5) {
            double estimate_max_heart_rate = 220 - age;
            double d = estimate_max_heart_rate - hr;
            double zone5low = d * 0.60 + hr;
            double zone5high = d * 0.70 + hr;
            System.out.printf("Exercise to keep your heart rate in the zone %.2f" , zone5low);
            System.out.printf(" - %.2f" , zone5high);
            System.out.println(" beats per minute.");
        }
        else {
            System.out.println("Not a valid entry. Please choose from the provided menu.");
        }

    }
}
