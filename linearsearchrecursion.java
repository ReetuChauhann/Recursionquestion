public class linearsearchrecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,18,7};
        boolean ans=exist(arr,18,0);
        System.out.println(ans);
        int ans2=existat(arr, 18, 0);
        System.out.println(ans2);
        int ans3=existatfromlast(arr, 18, 5);
        System.out.println(ans3);

    }
    
    static boolean exist(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||exist(arr, target, index+1);
    }

    static int existat(int[] arr,int target, int index){
        if(index==arr.length){
            return -1;
        }
    if(arr[index]==target){
        return index;
    }else{
       return existat(arr, target, index+1);
    }
  }

  static int existatfromlast(int[] arr,int target, int index){
    if(index==-1){
        return -1;
    }
    if(arr[index]==target){
    return index;
    }else{
       return existatfromlast(arr, target, index-1);
    }
  }
}
