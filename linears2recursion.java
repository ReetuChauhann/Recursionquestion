import java.util.ArrayList;
import java.util.List;

public class linears2recursion {
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5,5,5,7};
       // linaersearch(arr, 5, 0);
       // System.out.println(l);
        ArrayList<Integer> listp=new ArrayList<>();
        List<Integer> list5= linaersearch2(arr, 5, 0, listp);
        System.out.println(list5);

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

    static List<Integer> linaersearch2(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
         return list;
        }
       
        if(arr[index]==target){
          list.add(index);
        }
        return linaersearch2(arr, target, index+1, list);
      
  }
    
}
