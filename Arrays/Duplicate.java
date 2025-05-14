
import java.util.LinkedHashSet;
import java.util.Set;

public  class Duplicate{
    public static void main(String args[]){

        int arr[] = { 1,1,2,3,4,2,2,1};
         Set<Integer>  unique  =new LinkedHashSet<>();
        //  Set<Integer> unique = new LinkedHashSet<>();
        for(int  num :arr){
        unique.add(num);

    }
    System.out.println(" after remove the duplicates  the array is: "+unique);
}
}