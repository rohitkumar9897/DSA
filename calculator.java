import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        char character = sc.next().charAt(0);
        switch(character){
            case '+': c = a+b;
                      System.out.println (c );
                      break;
            case '-': System.out.println( a - b );
                      break;
            case '*': System.out.println( a * b );
                      break;
            case '/': System.out.println( a / b );
                      break;
            default : System.out.println("enter a valid number");
                      break;         
        }
    }
}