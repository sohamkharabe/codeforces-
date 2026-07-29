import java.util.*;

public class CP1843A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int k = 0; k < n; k++) {
                a[k] = sc.nextInt();
            }

            Arrays.sort(a);

            int sum = 0;
            int i = 0;
            int j = n - 1;

            while (i < j) {
                sum += a[j] - a[i];
                i++;
                j--;
            }

            System.out.println(sum);
        }
    }
}