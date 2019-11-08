import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(haveDrink(n));
        }
    }

    private static int haveDrink(int n) {
        int k = 0;
        while (n >= 3){
            if (n % 3 == 0){
                k = k+n/3;
                n = n/3;
            }
            if (n % 3 != 0){
                k = k + n/3;
                int x = n % 3;
                n = n/3+x;
            }
            if (n == 2){
                k= k +1;
            }
        }
        return k;
    }
}

