public class countzeroinno {
    public static void main(String[] args) {
        int n=1002004;
        countzeroinnumber(n);
        System.out.println(count);
        
    }
    static int count=0;
    static void countzeroinnumber(int n){
        if(n/10==n){
            return;
        }
        
        int last=n%10;
        if(last==0){
            count++;
        }
        countzeroinnumber(n/10);
    }
    
}
