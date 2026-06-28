import java.util.Scanner;

public class OddEven {
    public static void main(String[]args){
        Scanner  input = new Scanner(System.in);
        System.out.print("enter number:");
        int num = input.nextInt();
        String result = num % 2 == 0 ?"positive":"negative";
        System.out.println(result);
        input.close();


    }

    
}
