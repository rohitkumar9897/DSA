import java.util.*;
public class binarystring {
    
    public static void printbinarysrtings(int n, int lastplace, String str){
    
        if(n==0){
            System.out.println(str);
            return;
        }
        //for 0 in nth place
        if(lastplace==0){
            printbinarysrtings(n-1,0,str+"0");
            printbinarysrtings(n-1,1,str+"1");
        }
        //for 1 in nth place
        if(lastplace==1){
            printbinarysrtings(n-1,0,str+"0");
        }
    }
    public static void main(String args[]){
    
        printbinarysrtings(3, 0, "");

    }    
    
}
