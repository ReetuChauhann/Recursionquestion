public class productofdigit {
    public static void main(String[] args) {
        int n =1342;
        int ans = product(n);
        System.out.println(ans);
    }
    
    static int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }
}
