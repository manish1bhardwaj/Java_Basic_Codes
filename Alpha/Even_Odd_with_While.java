
import java.util.Scanner;
public class Even_Odd_with_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int counter = 0;
            while (counter <=100){
                counter++;
                if (counter%2==0){
                    System.out.println("Even : " +counter);
                }
                
            }
            sc.close();
        }
    }
    
}
