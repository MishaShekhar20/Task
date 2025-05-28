import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = n;i>=1 ; i--){
            ans = ans*i;
        }
        System.out.println("Factorial of a number is: "+ ans);
    }
}
