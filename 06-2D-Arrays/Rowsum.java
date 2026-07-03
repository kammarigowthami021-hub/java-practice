
public class Rowsum {
    public static void main(String[]args){ 
       int[][] arr2D = {
    {3, 5, 2},
    {1, 4, 6}
      };
      sum(arr2D);

    }
    static void sum(int[][] arr2D){ 
        int add;
        for(int i = 0;i<arr2D.length;i++){
            add = 0;
            for(int j = 0;j<arr2D[i].length;j++){
                 
                 add = add + arr2D[i][j];
            }
            System.out.println(add);
        }

     
    }
    
}
