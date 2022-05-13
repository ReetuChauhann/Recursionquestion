import java.util.ArrayList;
import java.util.List;

public class arraylistinbody {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        System.out.println(linearsearch(arr, 4, 0));
        
        
    }

    static ArrayList<Integer> linearsearch(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcall=linearsearch(arr, target, index+1);
        list.addAll(ansfrombelowcall);
        return list;
    }
}
