import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class RT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int counnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = ++counnt;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr));
        }
        scanner.close();
    }
}
