public class PassParameters { 
    public static void main(String[] args){
      //int ans = sum(2,3);
      //System.out.println(ans);
      String res = greet("neha");
      System.out.println(res);
    }
    /*static int sum(int a, int b){
        int res = a + b;
        return res;

    }*/
   static String greet(String name){
    String greeting = "hello " + name;
    return greeting;

   }

    
}
