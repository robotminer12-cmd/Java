import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double income, tax = 0;

        System.out.print("Enter annual income: ");
        income = sc.nextDouble();

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.10;
        } else if (income <= 800000) {
            tax = (250000 * 0.10) + (income - 500000) * 0.20;
        } else {
            tax = (250000 * 0.10) + (300000 * 0.20) + (income - 800000) * 0.30;
        }

        System.out.println("Income Tax = Rs. " + tax);

        sc.close();
    }
}
 