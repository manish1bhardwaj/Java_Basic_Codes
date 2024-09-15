import java.util.Scanner;
public class Even_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
             int n = sc.nextInt();
             for(int i = 1 ; i<=n ; i++){
                if (i%2==0){
                    System.out.println("Even : "+i);
                }
             }
             sc.close();
        }
    }
    
}
