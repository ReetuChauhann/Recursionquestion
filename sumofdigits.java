public class sumofdigits {
    public static void main(String[] args) {
        int n=1342; 
        int ans=sumofdigits(n);
        System.out.println(ans);
    }
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofdigits(n/10);
    }
}
