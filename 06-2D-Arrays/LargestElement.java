import java.util.Scanner;
public class LargestElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println("enter input:");
       for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            arr[i][j] = sc.nextInt();
        }
        
       } 
       System.out.println("Finished taking input");
       sc.close();
       int ans = findLarge(arr);
       System.out.println("largest: "+ans);
    }
    static int findLarge(int[][] arr){
        int largest= arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++ ){
                if(arr[i][j]>largest){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

    
}
