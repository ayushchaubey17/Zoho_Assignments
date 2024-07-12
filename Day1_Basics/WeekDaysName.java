//. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum
import  java.util.*;

public class WeekDaysName {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of day to get the weekday name: ");
        int dayNum = sc.nextInt();
        sc.close();

        if (dayNum < 1 || dayNum > 7) {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
            return;
        }

        Day[] days = Day.values();
        Day chosenDay = days[dayNum - 1];


        System.out.println("It is: " + chosenDay);
    }

}
