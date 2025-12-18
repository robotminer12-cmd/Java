import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        String result = (year % 400 == 0) ? "Leap Year"
                : (year % 100 == 0) ? "Not a Leap Year" : (year % 4 == 0) ? "Leap Year" : "Not a Leap Year";

        System.out.println(year + " is " + result);
        scanner.close();
    }
}
