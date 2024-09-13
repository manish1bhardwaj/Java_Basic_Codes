import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        System.out.println("Enter the year: ");    // Prompt the user to enter a year      
        int year = sc.nextInt();
        if (year%4!=0) {                             // Check if it's not divisible by 4, hence not a leap year
            System.out.println("Not a Leap Year :" +year);
        }
        else if (year%100==0 && year%400!=0){         // Check if divisible by 100 but not by 400, hence not a leap year
            System.out.println("Not a Leap Year " +year);
        }
        
        else{                                          // Otherwise, it's a leap year
            System.out.println("Leap Year " +year);
        }
        sc.close();
    }
        
    }
           
    
}
