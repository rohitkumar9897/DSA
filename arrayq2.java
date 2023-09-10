public class arrayq2 {

    public static void keyinarray(int array[][]){
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[0].length;j++){
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[0].length;j++){
                System.out.print(array[j][i]+" ");

            }
            System.out.println();
        }
        
        
    }    
       

    public static void main(String args[]){
        int array[][]= {{1,4,9},{11,4,3},{2,2,3}};
        keyinarray(array);
    }
    
}    