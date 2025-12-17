import java.util.*;
public class input {
    public static void main(String[]args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Hellow your user please wrtie your name:");
        String name =sc.nextLine();
        System.out.println ("Enter your lucky number");
        int lucky=sc.nextInt();
        System.out.println("Hello "+name +lucky);
    }
    
}
