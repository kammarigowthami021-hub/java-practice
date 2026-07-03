import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
        sc.close();

    }
    static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;

        }
        return fact;

    }
    
}
