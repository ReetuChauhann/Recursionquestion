public class linearsearchrecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,18};
        boolean ans=exist(arr,18,0);
        System.out.println(ans);
    }
    
    static boolean exist(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||exist(arr, target, index+1);
    }
}
