import java.util.Scanner;
public class Oddeven {
    public static void main(String[]args) {
Scanner sc=new
Scanner (System.in);
System.out.print("enter a number");
int num=sc.nextInt();
if (num%2==0) {
System.out.println("This number is even");
}
else {
System.out.println("The number is odd");
}
   sc.close();
    }
    
}
