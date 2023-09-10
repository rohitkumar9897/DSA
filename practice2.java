import java.io.*;
import java.util.*;

public class practice2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String[] str = new String [T]; 
        sc.nextLine();
        for(int i=0; i<T; i++){
            str[i]=sc.nextLine();           
        }
        for(int i=0; i<T; i++){
            for(int j=0; j<str[i].length(); j++){
                if(j%2==0){
                    System.out.print(str[i].charAt(j));
                }
                       
            }
            System.out.print(" "); 
            for(int j=0; j<str[i].length(); j++){
                if(j%2==1){
                    System.out.print(str[i].charAt(j));
                }
                       
            } 
            System.out.println();         
        }
        
    }
}
