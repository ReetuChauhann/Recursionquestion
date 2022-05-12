public class basic2 {
    public static void main(String[] args) {
        print(1);
    }
   
    static void print(int n){
         if(n==5){
             System.out.println(5);
             return; // returning the control of the program to the function call where it was called
         }
        System.out.println(n);
        print(n+1);
    }
}
