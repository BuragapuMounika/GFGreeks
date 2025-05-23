import java.util.Scanner;
public class CompareString {
    public static void main(String args[]){
        String s1 ="Mounika Buragapu";
        String s2 = "Shradga Khapra";
        // System.out.println(s1.compareTo(s2));

       int  res = s1.compareTo(s2);

       if(res==0){
        System.out.println("same");

       }else if (res >0){
        System.out.println("greater");
       }
       else{
        System.out.println("smaller");
       }
    }



    }
    

