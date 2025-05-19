import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch(age){
            case 13:
                System.out.println("Teen");
                break;
            case 18:
                System.out.println("Adult");
                break;
            case 60:
                System.out.println("Senior Citizen");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
