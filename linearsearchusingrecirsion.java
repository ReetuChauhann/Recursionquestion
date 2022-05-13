public class linearsearchusingrecirsion {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,3};
        //int target=7;
        int target=6;
        int ans=linear(arr,target,0);
        System.out.println(ans);
    }
    static int linear(int[] arr,int target,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return linear(arr,target,index+1);
        }
    }
}
