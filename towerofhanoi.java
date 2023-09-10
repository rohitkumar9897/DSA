public class towerofhanoi {
    
    public static void solvehanoi(String src, String helper, String dest, int disks){
        if(disks==1){
            System.out.println(" transfer disc " + disks + " from " + src + " to " + dest);
            return;
        }
        solvehanoi(src, dest , helper , disks-1);
        System.out.println(" transfer disc " + disks + " from " + src + " to " + dest);

        solvehanoi(helper, src , dest , disks-1);

    }


    public static void main(String args[]){
        int n=5;
        solvehanoi("a","b","c", n);
    }
    
}
