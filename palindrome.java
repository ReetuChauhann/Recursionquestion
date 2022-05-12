public class palindrome {
    public static void main(String[] args) {
        //int n=1552;
        int n=1551;
        int original=n;
        plain(n);
        if(sum==original){
            System.out.println("yes");
        }else{
            System.out.println("Not");
        }
    }
    static int sum=0;
    static void plain(int n){
        if(n/10==n){
            return;
        }
        int last=n%10;
        sum=sum*10+last;
        plain(n/10);
    }
}
