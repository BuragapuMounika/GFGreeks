import java.util.*;

public class StringCapital {
    public static void  string(String s){
        String res1 = s.toUpperCase();
        //String res2 = s.substring(0,1).toUpperCase()+s.substring(1);
        String res2 = s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(res1);
        System.out.println(res2);

    }


    public static void main(String args[]){
        String str ="hello";
       string(str);

    }
    
}
