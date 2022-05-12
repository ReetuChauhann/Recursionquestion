import java.net.SocketTimeoutException;

public class factorial {
    public static void main(String[] args) {
       int ans= factor(5);
       System.out.println(ans);
    }
    
    static int factor(int n){
        if(n==1){
            return 1;
        }
        return n*factor(n-1);
    }
}
