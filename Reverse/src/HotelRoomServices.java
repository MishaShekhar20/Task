import java.util.Scanner;

public class HotelRoomServices {
    public static void main(String[] args) {
        System.out.println("Hotel Room Services");
        Scanner sc = new Scanner(System.in);
        int service = sc.nextInt();
        switch(service){
            case 101:
                System.out.println("You ordered Veg");
                break;
            case 102:
                System.out.println("You ordered Non-veg");
                break;
            case 103:
                System.out.println("You ordered an Ice-cream");
                break;
            case 104:
                System.out.println("You ordered Biryani");
                break;
            case 105:
                System.out.println("You ordered Juice");
                break;
            default:
                System.out.println("You ordered Nothing!");
        }
    }
}
