import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz :");
        n = input.nextInt();



        for (int i =1 ; i<=n;i++ ){
            for (int j=1 ; j<=(n-i) ; j++ ){
                System.out.print(" ");
            }
            for (int k = 1 ; k<=((2*i)-1);k++ ){
                System.out.print("*");

            }

            System.out.println();

        }
        for (int a = (n - 1); a >= 1; a--) {
            System.out.println(a);
            for (int b = (n - a); b >= 1; b--) {
                System.out.print(" ");
            }
            for (int c = (2 * a - 1); c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



