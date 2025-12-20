import java.util.Scanner;

public class capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an uppercase or lowercase letter: "); 

        
        String letter = sc.next(); 
        char ch = letter.charAt(0); 


        if (ch >= 'A' && ch <= 'Z') { 
            System.out.println("This letter is uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("This letter is lowercase");
        } else {
            System.out.println("This is not a letter."); 
        }

        sc.close(); // Close the Scanner object
    }
}
    