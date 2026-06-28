public class MinMax {
    public static void main(String[] args){
        int ans = Maximum(10,20,30);
        System.out.println(ans);
        int res = Minimum(23,45,63);
        System.out.println(res);

    }
    static int Maximum(int a,int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
        
    }
    static int Minimum(int a,int b,int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if (c<min){
            min = c;
        }
        return min;
    }
    
}
