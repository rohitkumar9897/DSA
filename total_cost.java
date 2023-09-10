import java.io.*;
import java.util.*;

public class total_cost {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        long n[]= new long[T];
        for(int i=0; i<T; i++){
            n[i] = sc.nextLong();
        }
        for(int i=0; i<T; i++){
            if(n[i]>= -128 && n[i]<=127){
                System.out.println(n[i]+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(n[i]>= -32768 && n[i]<=32767){
                System.out.println(n[i]+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(n[i]>= -(int)Math.pow(2,31) && n[i]<=(int)Math.pow(2,31)-1){
                System.out.println(n[i]+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(n[i]>= -(long)Math.pow(2,63) && n[i]<=(long)Math.pow(2,63)-1){
                System.out.println(n[i]+" can be fitted in:");
                System.out.println("* long");
            }else{
                System.out.println(n[i]+" can't be fitted any where.");
                
            }            
        }
    }
}