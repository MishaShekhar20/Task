import org.w3c.dom.ls.LSOutput;

public class Reverse {
    public static void main(String[] args) {
        int digit = 14567;
        int rev = 0;
        while(digit > 0){
            int last = digit%10;
            rev = rev*10+last;
            digit = digit/10;
        }
        System.out.println("The reversed number is " + rev );
    }
}
