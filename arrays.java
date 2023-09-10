public class arrays {

    public static void keyinarray(int array[][], int key){
        int sum=0;
        for(int i=0 ; i<= array.length-1 ; i++){
            for(int j=0 ; j<= array[0].length-1 ; j++){
                if(key==array[i][j]){
                    sum++;

                }
            }

        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        int array[][]= {{4,7,8},{8,8,7}};
        int key=7;
        keyinarray(array,key);
    }
    
}
