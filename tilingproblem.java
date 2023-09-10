import java.util.*;
public class tilingproblem {
   
    public static int countnumberoftiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        //for vertical
        int tiles1 = countnumberoftiles(n-1);

        //for horizontal
        int tiles2 = countnumberoftiles(n-2);

        int totaltiles = tiles1+tiles2;
        return totaltiles;


    }
    public static void main(String args[]){
        System.out.println(countnumberoftiles(3));

    }
    
}
