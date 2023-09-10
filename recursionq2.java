public class recursionq2 {

    public static void stringlength(String str, int i, int length){
        
        if(i<str.length()){
            length+=1;
            stringlength(str,i+1,length);
        }
        else{
        System.out.println(length);
        }
    }

    public static void main(String args[]){
        String str="Rohit Kumar";
        int length=0;
        int i=0;
        stringlength(str, i,length);

    }
    

}
