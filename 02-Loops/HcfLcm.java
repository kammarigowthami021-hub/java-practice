import java.util.Scanner;
public class HcfLcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while(y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        int hcf = x;
        int lcm = (a*b)/hcf;
        System.out.println("hcf"+ hcf);
        System.out.println("lcm"+ lcm);
        sc.close();

        
    }
    
}
