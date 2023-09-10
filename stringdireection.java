import java.util.*;
public class stringdireection {

    public static void shortestdistance(String str){
        int x=0;
        int y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
        System.out.println("FinalCoordinates are:"+ x +","+ y);
        int a= x*x + y*y;
        int distance= (int)Math.sqrt(a);
        System.out.println(distance);

    }
    
    public static void main(String args[]){
        String str= "WNEENESENNN";
        shortestdistance(str);
    }
    
}
