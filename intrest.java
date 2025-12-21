import java.util.Scanner;

public class intrest {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double principal,time;
        double rate=7.0;
System.out.println("Press 1 for simple intrest");
System.out.println("press 2 for compund intrest");
System.out.println("Enter your choice:");
int choice=sc.nextInt();
switch (choice) {

case 1:
//Simple intrest
System.out.print("Enter principal amount:");
principal=sc.nextDouble();

System.out.print("Enter times is years:");
time=sc.nextDouble();
double si=(principal*time*rate/100);
System.out.print("Simple intrest at 7% per annum="+si);
break;
case 2:
    //compound intrest
    System.out.print("Enter principal amount:");
    principal=sc.nextDouble();
    System.out.print("Enter time is years:");
    time=sc.nextDouble();
double amount=principal*Math.pow((1+rate/100)2,time);
double ci=amount-principal;
System.out.print("Compund intrest at 7% per annum="+ci);
break;

default:
    System.out.println("Invalid Choice please choose between 1 and 2");

}
sc.close();
    }
 


}
