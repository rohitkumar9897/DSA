import java.util.*;
public class palindrome {
    public static double checkpalindrome(double n){
        double reverse= 0;
        int pow= 0;
        
        while(n>0){
            int ld= n%10;
            reverse = reverse + [ld*Math.pow(10,pow)];
            pow++;
            n=n/10;

        }
        System.out.println(reverse);

    } 

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double n= sc.nextDouble();
        checkpalindrome(n);


    }
    
}
