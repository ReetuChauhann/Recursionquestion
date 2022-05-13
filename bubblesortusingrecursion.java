import java.util.Arrays;

public class bubblesortusingrecursion {
    public static void main(String[] args) {
        int[] arr={1,2,6,5,3,4};
        bubblesort(arr,5,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr, r, c+1);
        }else{
            bubblesort(arr, r-1, 0);
        }
    }
}
