public class countnoofstepstoreduceanotozero {
    public static void main(String[] args) {
        int n=143;
        countsteps(n);
        System.out.println(count);

    }
    static int count=0;
    static void countsteps(int n){
        if(n==0){
            return;
        }
        countsteps(n/10);
        count++;
    }
}
