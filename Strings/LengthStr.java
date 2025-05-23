import java.util.Scanner;
public class LengthStr {
    public static int length(String  s){
       return  s.length();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();

        int result = length(str); //calling

        System.out.println(result);


    }
    
}
