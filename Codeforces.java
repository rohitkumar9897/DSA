import java.util.*;

public class Codeforces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=0; k<t; k++){
            int n = sc.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int x= a[n-1];
        if(a[0]==x){
            System.out.println("-1");
        }else{
            for (int i = 0; i < n; i++){
                if(a[i]<x){
                    list1.add(a[i]);
                }else if(a[i]==x){
                    list2.add(a[i]);
                }
            }
            System.out.println(list1.size()+" "+ list2.size());
            for(int l=0; l<list1.size(); l++){
                int m=list1.get(l);
                System.out.print(m+" ");
            }
            System.out.println();
            for(int l=0; l<list2.size(); l++){
                int o=list2.get(l);
                System.out.print(o+" ");
            }
            System.out.println();
        }
        }
        
        

    }
}
