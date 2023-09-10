import java.util.*;
public class hr {

    public static void merge(String arr[], int si, int mid, int ei){
        String temp[]= new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left out conditions
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
        

    }

    public static void mergesort(String arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si + (ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        // to merge the sorted array
        merge(arr, si, mid, ei);

    }
    public static void main(String[] args) {
        String  arr[] = { "sun", "earth", "mars", "mercury"};
        int si=0;
        int ei= arr.length-1;
        mergesort(arr,si,ei);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
