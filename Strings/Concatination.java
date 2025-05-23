public class Concatination {

    public static void main(String args[]){
        // String s1 ="geeks";
        // String s2 ="GREEKS FOR THE GREEKS";
    //     String s2 = s1;
    // s1 = s1+"for greeks";
    // if(s1==s2)
    // {
    //     System.out.println("Same");
    // }
    // else{
    //     System.out.println("Not Same");
    // }

    // System.out.println(s1.toUpperCase());
    // System.out.println(s2.toLowerCase());
    // System.out.println(s2.indexOf("fo"));

    // System.out.println(s2.trim());

String  s1 ="greeks";
String s2 =s1;
// if(s1==s2){
//     System.out.println("yes !");
// }else{
//     System.out.println("No!");
// }
s1=s1+"for greeks";

System.out.println(s1);
if(s1 == s2){
    System.out.println(s1);
}else{
    System.out.println("oops!!!");
}

StringBuilder sb1= new StringBuilder("greeks");
StringBuilder sb2= sb1;

sb1 = sb1. append("for greeks");

if(sb1 == sb2){
    System.out.println("yes it is same!!");
}else{
    System.out.println(" no it is not same");
}


    }
}

