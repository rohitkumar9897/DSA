/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class advancedpatterns {

    public static int trappedwater(int price[]){
        // int trappedwater=0;
        // int leftMax[]=new int[height.length];
        // leftMax[0]=height[0];
        // for(int i=1; i<height.length; i++){
        //     leftMax[i]= Math.max(height[i],leftMax[i-1]);
        // }
        int profit=Integer.MIN_VALUE;

        int rightMax[]=new int[price.length];
        rightMax[price.length-1]=price[price.length-1];
        for(int i=price.length-2; i>=0; i--){
            rightMax[i]= Math.max(price[i],rightMax[i+1]);
        }

        for(int i=0; i<price.length; i++){
            // int waterLevel=Math.min(leftMax[i],rightMax[i]);
            // trappedwater += (waterLevel-height[i])*1;
            int maximum= rightMax[i]-price[i];
            if(maximum>profit){
                profit=maximum;
            }

        }
        // return trappedwater;
        return profit;

    }
    public static void main(String args[]){
        int profit[]={7,1,5,3,6,4};
        System.out.println(trappedwater(profit));
        
    }
}
