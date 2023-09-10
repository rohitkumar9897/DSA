import java.util.*;

public class codeforces3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int z=0; z<n; z++){
            int x=sc.nextInt(), y=sc.nextInt();
            char arr[][]= new char[x][y];
            for(int j=0; j<x; j++){
                for(int k=0; k<y; k++){
                    arr[j][k]= sc.next().charAt(0);
                }
            }
            int count=0;
            for(int j=0; j<x; j++){
                if(arr[j][0]== 'v'){
                    count=1;
                }
            }
            if(count==0){
                System.out.println("NO");
                break;
            }
            count=0;
            for(int j=0; j<x; j++){
                if(arr[j][1]== 'i'){
                    count=1;
                }
            }
            if(count==0){
                System.out.println("NO");
                break;
            }
            count=0;
            for(int j=0; j<x; j++){
                if(arr[j][2]== 'k'){
                    count=1;
                }
            }
            if(count==0){
                System.out.println("NO");
                break;
            }
            count=0;
            for(int j=0; j<x; j++){
                if(arr[j][3]== 'a'){
                    count=1;
                }
            }
            if(count==0){
                System.out.println("NO");
                break;
            }
        }
    }
}
