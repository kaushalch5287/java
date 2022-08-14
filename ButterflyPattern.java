import java.util.Scanner;
public class ButterflyPattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter: ");
        int a = input.nextInt();
        input.close();
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j <= i ;j++){
                System.out.print("*");
            }
            for(int j = a - i - 1; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int j = a - i - 1 ; j > 0 ; j--){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = a + 1 ;i <= 2*a ;i++ ){
            for(int j = 2*a ; j >= i ;j--){
                System.out.print("*");
            }
            for(int j = a + 1 ; j < i ;j++){
                System.out.print(" ");
            }
            for(int j = a + 1 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 2*a ; j >= i ;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
