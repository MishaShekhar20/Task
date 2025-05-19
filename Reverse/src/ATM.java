import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Choose your serivce");
        Scanner sc = new Scanner(System.in);
        int service = sc.nextInt();
        switch(service){
            case 1:
                System.out.println("Request for Balance Enquiry");
                break;
            case 2:
                System.out.println("Request for Withdrawal");
                break;
            case 3:
                System.out.println("Request for Change of pin");
                break;
            case 4:
                System.out.println("Request for Deposit");
                break;
            default:
                System.out.println("Exit");
        }
    }
}
