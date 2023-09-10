public class recursionq4 {

    public static int substring(String str, int i, int j, int length){
        if(length<=0){
            return 0;
        }
        if(length==1){
            return 1;
        }

        int n=substring(str,i+1,j, length-1)+
              substring(str,i,j-1, length-1)-
              substring(str,i+1,j-1, length-2);
        
        if(str.charAt(i)== str.charAt(j)){
                n++;
        }        
        return n;
    }

    public static void main(String args[]){
        String str="aba";
        int n= str.length();
        int i=0;
        int j= n-1;
        System.out.println(substring(str, i, j, n));

    }
    

}