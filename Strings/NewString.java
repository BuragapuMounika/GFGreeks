import java.util.Scanner;
public class NewString {
    public static void main(String args[]){
        String s1 = " Mounika";
        String s2 =" Mounika";
         if(s1 == s2){
            System.out. println("yes");
         }else{
            System.out.println("No");
         }

         String s3 = new String("Mounika");
         if(s1 == s3){
            System.out.println("yes");
         }
         else{
            System.out.println("No");
         }

         System.out.println(s1.contains(s2));// true
         System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));


    }

    
}
