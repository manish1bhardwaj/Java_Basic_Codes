import java.util.Scanner;

public class Sum_n_Natural_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            int sum = 0;
            int i = 1;
            while (i<=n){
                sum = sum+i;
                i++;
            } 
            System.out.print("sum is : "+sum + " ");
            sc.close();
        }
    }
    
}
