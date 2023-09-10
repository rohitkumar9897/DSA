import java.util.Scanner;

public class codeforces4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char arr[][] = new char[n][m];

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = row.charAt(j);
                }
            }

            boolean found = false;
            for (int j = 0; j < m - 3; j++) {
                for (int k = j + 1; k < m - 2; k++) {
                    for (int l = k + 1; l < m - 1; l++) {
                        for (int p = l + 1; p < m; p++) {
                            if (checkColumns(arr, j, k, l, p)) {
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean checkColumns(char[][] arr, int j, int k, int l, int p) {
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i][j] == 'v' || arr[i][k] == 'i' || arr[i][l] == 'k' || arr[i][p] == 'a')) {
                return false;
            }
        }
        return true;
    }
}
