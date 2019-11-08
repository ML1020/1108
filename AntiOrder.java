import java.util.LinkedList;
import java.util.Scanner;

public class AntiOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n;i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(count(A,n));
    }
    public static int count(int[] A, int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int m:A){
            list.add(m);
        }
        int count = 0;
        for (int i = 0;i <= n-2;i++){
            for (int j = i+1;j <= n-1;j++){
                int x = list.get(i);
                int y = list.get(j);
                if (x > y){
                    count ++;
                }
                continue;
            }
        }
        return count;
    }
}
