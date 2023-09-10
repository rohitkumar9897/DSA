import java.util.*;
public class student {
	public static void subarraysum(int numbers[]){
        int maxsum= Integer.MIN_VALUE;
        int minsum= Integer.MAX_VALUE;
        for(int i=0 ; i<numbers.length; i++){
            for(int j=i+1 ; j<numbers.length; j++){
                int sum=0;
                int currsum=0;
                for(int k=i ; k<=j ; k++){
                    System.out.print(numbers[k] +" ");
                    sum=sum + numbers[k];
                }

                System.out.println("sum is: " + sum + " ");
                if(sum>maxsum){
                    maxsum = sum;
                }
                if(sum<minsum){
                    minsum = sum;
                }
               
            }
            System.out.println(" ");
        }
        System.out.println(" maxsum is:" + maxsum +" "+ "minsum is: "+ minsum);

    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int numbers[]= {1,-2,6,-1,3};
        subarraysum(numbers);
        


    }
}