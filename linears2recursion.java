import java.util.ArrayList;
import java.util.List;

public class linears2recursion {
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5,5,5,7};
        linaersearch(arr, 5, 0);
        System.out.println(l);

    }
    static List<Integer> l=new ArrayList<>();
    static void linaersearch(int[] arr, int target, int index){
          if(index==arr.length){
           return;
          }
         
          if(arr[index]==target){
            l.add(index);
          }
           linaersearch(arr, target, index+1);
        
    }
    
}
