import java.util.*;
public class JavaBasics {
    public static int checkpalindrome(int n){
		int reverse= 0;
        int pow= 0;
		
        
        while(n>0){
			int ld= n%10;
            reverse = reverse + ld * (int)Math.pow(10,pow);
            pow++;
            n=n/10;

        }
		System.out.println(reverse);
        
		return reverse;

    } 

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int reverse = checkpalindrome(n);
		if(reverse == n){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");

		}


    }
    
}
