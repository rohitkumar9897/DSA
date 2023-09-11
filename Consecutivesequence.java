import java.util.*;
public class Consecutivesequence {


    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maximum=0;
        int max=0;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i+1]-nums[i])==1){
                max++;
            }else if((nums[i+1]-nums[i])==0){
                max= max;
            }
            else{
                max=0;
            }
            maximum= Math.max(max, maximum);
        }
        if(nums.length==0){
            return 0;
        }
        return maximum+1;
        
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x= longestConsecutive(arr);
        System.out.println(x);
    }
}
