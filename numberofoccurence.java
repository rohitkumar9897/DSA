import java.util.*;
public class numberofoccurence {
    public static void main(String args[]){
        int arr[]= {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key= 2;
        keyoccurence(arr, key, 0);

    }

    public static void keyoccurence(int arr[], int key, int i){
    /*    if(i==arr.length){
            System.out.println( "key not found ");
            return;

        }
    */
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        keyoccurence(arr,  key, i+1);
    }
}
