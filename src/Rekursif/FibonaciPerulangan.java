package Rekursif;

public class FibonaciPerulangan {
    public static void main(String[] args) {
        int x = 0; //f0
        int y = 1; //f1
        int sum = 0; //hasil
        int n = 6; //fn

        if (n == 0){
            sum = x;
        }else if (n == 1){
            sum = y;
        }else{
            for(int i = 2; i <= n; i++){
                sum = x + y;
                x = y;
                y = sum;
            }
        }
        System.out.print("Fibo : " +sum);
    }
}
