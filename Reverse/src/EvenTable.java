public class EvenTable {
    public static void main(String[] args) {
        int num = 2;
        for(int n=1; n<=10;n++){
            if(n%2==0){
                System.out.println(num + "*" + n + "=" + num*n) ;
            }
        }
    }
}
