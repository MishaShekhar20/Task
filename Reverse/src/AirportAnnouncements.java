import java.util.Scanner;

public class AirportAnnouncements {
    public static void main(String[] args) {
        System.out.println("Enter the gate number between 1-15");
        Scanner sc = new Scanner(System.in);
        int gate = sc.nextInt();
        switch(gate){
            case 1:
                System.out.println("Domestic Departures");
                break;
            case 2:
                System.out.println("Domestic Arrivals");
                break;
            case 3:
                System.out.println("International Departures");
                break;
            case 4:
                System.out.println("International Arrivals");
                break;
            case 5:
                System.out.println("Lounge Entry");
                break;
            case 6:
                System.out.println("Immigration Check");
                break;
            case 7:
                System.out.println("Security Check");
                break;
            case 8:
                System.out.println("Custom Checks");
                break;
            case 9:
                System.out.println("Crew only");
                break;
            case 10:
                System.out.println("VIP Entry");
                break;
            case 11:
                System.out.println("Boarding Gate");
                break;
            case 12:
                System.out.println("Maintenance Area");
                break;
            case 13:
                System.out.println("Loading Cargo");
                break;
            case 14:
                System.out.println("Baggage Collection");
                break;
            case 15:
                System.out.println("Transit Passengers Only");
                break;
            default:
                System.out.println("Invalid Gate entry");
        }
    }
}
