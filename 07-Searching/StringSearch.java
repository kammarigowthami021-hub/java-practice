public class StringSearch {
    public static void main(String[] args){
        String name = "Gouthami";
        char ch = 't';
        System.out.println(searchchar1(name, ch));
    }
    
    // static boolean searchchar(String name,char ch){
    //     if(name.length()==0){
    //      return false;
    //     }
    //     for(int i = 0;i<name.length();i++){
    //         if(ch == name.charAt(i)){
    //             return true;
    //         }
    //        }
    //        return  false;
    // }
    static boolean searchchar1(String name,char ch){
        if(name.length()==0){
         return false;
        }
        for(char c:name.toCharArray()){
            if(c == ch){
                return true;
            }
           }
           return  false;
    }
    

}
