import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();
        System.out.println("Choose an operator: ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                result = n1 + n2;
                System.out.println("Sum is:"+ result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Diff is:"+ result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Product is:"+ result);
                break;
            case '/':
                result = n1 / n2;
                System.out.println("Quotient is:"+ result);
                break;
            default:
                System.out.println("Invalid Operator");


        }
    }
}
