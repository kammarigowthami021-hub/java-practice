import java.util.Arrays;
import java.util.Scanner;
public class InputArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][]arr2D = new int[2][3];
        for(int row = 0;row<arr2D.length;row++){
            for(int col = 0;col<arr2D[row].length;col++){
                arr2D[row][col] = sc.nextInt();
            }
        }
       // for(int row = 0;row<arr2D.length;row++){
           // for(int col = 0;col<arr2D[row].length;col++){
               // System.out.print(arr2D[row][col] + " ");
           // }
       //     //System.out.println();
       // }
       for(int [] a:arr2D){
        System.out.println(Arrays.toString(a));
       }
        

        
    }
    
}
