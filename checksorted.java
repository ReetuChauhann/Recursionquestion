public class checksorted {
    public static void main(String[] args) {
        int[] arr={67,60,56,55};
        checksort(arr);
    }
    
    static void checksort(int[] arr){
        boolean Asc=false;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
            Asc=(arr[j]>arr[j-1]);
                }
        }
        if(Asc){
                System.out.println("array sorted in Asc");
        }else{
            System.out.println("Array is sorted in desc");
        }
    }
}
