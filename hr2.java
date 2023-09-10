import java.util.*;

public class hr2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {  // if n is odd
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {  // if n is even and between 2 and 5 (inclusive)
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {  // if n is even and between 6 and 20 (inclusive)
                System.out.println("Weird");
            } else {  // if n is even and greater than 20
                System.out.println("Not Weird");
            }
        }
    }
}