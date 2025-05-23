import java.util.Arrays;
public class ExtraString {
    public static int extra(String s1,String s2){
        // to convert string to array in order to  sort the elements
       char []  arr1 = s1.toCharArray();
       char [] arr2 = s2.toCharArray();
// we have to sort the elements 
       Arrays.sort(arr1);
       Arrays.sort(arr2);


    int n = arr1.length;
    for(int i=0;i<n;i++){
        if(arr1[i]!= arr2[i]){
            return arr2[i];

        }
    }


    }
    public static void main(String args[]){
        String s1 ="abcd";
        String s2 = "abcde";
//calling
int  res =extra(s1,s2);
System.out.println(res);

    }
    
}
