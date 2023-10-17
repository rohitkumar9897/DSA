public class recursionq2repeat {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        if(n==0){
            return;
        }
        int ld=n%10;
        n=n/10;
        printDigits(n);
        System.out.print(digits[ld]+" ");
        
    }
    public static void main(String args[]){
        int n=189705;
        printDigits(n);
        System.out.println();
    }
    
}
