import java.util.Scanner;
public class Print_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter A range : ");
            int Range = sc.nextInt();
            int Counter  = 1;
            while (Counter <= Range){
                System.out.print(Counter + " ");
                    Counter++;
            }
            System.out.println("Task Completed");
           
            sc.close();

        }
              

    }
    
}
