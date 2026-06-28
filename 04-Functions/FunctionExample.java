import java.util.Scanner;

public class Function{
    public static void main(String[] args){
       int ans = Sum();
       System.out.println(ans);
      

    }
   
    static int Sum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int add = n + m;
        return add; 

    }
    
   
    
}