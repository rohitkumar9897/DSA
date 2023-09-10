public class codeshef2{
    public int removePalindromeSub(String s) {
        if (s.equals(new StringBuilder(s).reverse().toString())) return 1;
        return 2;
    }
    public static void main(String args[]){
        String str= "WNEENESENNN";
        removePalindromeSub(str);
    }
}