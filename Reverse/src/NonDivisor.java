public class NonDivisor {
    public static void main(String[] args) {
        int num = 20;
        for(int i=1;i<=20;i++){
            if(num%i != 0){
                System.out.println(i);
            }
        }
    }
}
