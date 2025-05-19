public class Palindrom {
    public static void main(String[] args) {
        int digit = 12321;
        int temp = digit;
        int rev = 0;
        while(digit>0){
            int last = digit%10;
            rev = rev*10+last;
            digit = digit/10;
        }
        if(temp == rev){
            System.out.println("Number is a palindrom");
        }
        else{
            System.out.println("Number isnt a palindrom");
        }
    }
}
