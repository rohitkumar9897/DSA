import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            solveTestCase(a);
        }
    }

    public static void solveTestCase(int[] a) {
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        
        Arrays.sort(a);

        int gcd = a[0];
        for (int i = 1; i < a.length; i++) {
            gcd = gcd(gcd, a[i]);
        }

        if (gcd != a[a.length - 1]) {
            System.out.println("-1");
            return;
        }

        b.add(a[a.length - 1]);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == gcd) {
                c.add(a[i]);
            } else {
                b.add(a[i]);
            }
        }

        System.out.println(b.size());
        for (int num : b) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(c.size());
        for (int num : c) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
