import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your item in the menu");
        char choice = sc.next().charAt(0);
        switch(choice){
            case 'A':
                System.out.println("You chose Chocolate");
                break;
            case 'B':
                System.out.println("You chose Magnum Ice-cream");
                break;
            case 'C':
                System.out.println("You chose Mogu-Mogu");
                break;
            case 'D':
                System.out.println("You chose Kinder joy");
                break;
            case 'E':
                System.out.println("You chose Smoodh Drink");
                break;
            case 'F':
                System.out.println("You chose Chips");
                break;
            case 'G':
                System.out.println("You chose Coke");
                break;
            case 'H':
                System.out.println("You chose Dark Fantasy");
                break;
            case 'I':
                System.out.println("You chose Cornetto Ice-cream");
                break;
            case 'J':
                System.out.println("You chose Lotte choco pie");
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}
