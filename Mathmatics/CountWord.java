import java.util.Scanner;
public class CountWord {
    public static int Count(String str){
        if(str.isEmpty()){
            return 0;

        }
        int space=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                space++;


            }

        }
        return space+1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();

        int result = Count(str);
        System.out.println(result);


    }

    
}
