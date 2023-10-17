import java.util.HashMap;

public class hashingq2 {
    public static void main(String args[]){
        HashMap<Integer,Integer> hm= new HashMap<>();
        int arr[]={3,2,4};
        int target=6;
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i],i);
        }
        for(int i=0; i<arr.length; i++){
            int n= target-arr[i];
            if(hm.containsKey(n)&&i!=hm.get(n)){
                System.out.print("["+i+","+hm.get(n)+"]");
                return;
            }
        }

    }
}
