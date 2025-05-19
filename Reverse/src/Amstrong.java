public class Amstrong {
    public static void main(String[] args) {
        int digit = 371;
        int temp = digit;
        int ori = temp;
        int count = 0;
        while(digit>0){
            int mod = digit%10;
            count++;
            digit = digit/10;
        }
        int sum = 0;
        while(temp>0){
            int last = temp%10;
            sum = sum +(int) Math.pow(last , count);
            temp = temp/10;
        }
        if(ori == sum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
