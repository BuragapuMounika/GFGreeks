import java.util.Scanner;
public class Quadratic_roots {

    public static int[] quadratic(int a, int b,int c){
        int array[] =new int [2];
        int des=b*b-4*a*c;

        if(des<0){
           return  new int []{-1};
        }

        double sqrtd= Math.sqrt(des);
        double root1 =(-b+sqrtd)/(2.0*a);
        double root2 =(-b-sqrtd)/(2.0*a);


        int floorroot1 =(int) Math.floor(root1);
        int floorroot2 =(int)Math.floor(root2);

    
    if(floorroot1>floorroot2){
    array[0]=floorroot1;
    array[1]=floorroot2;

    }
    else{
        array[0]=floorroot2;
        array[1]=floorroot1;
    }
    return array;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc. nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    int root[] =quadratic(a, b, c);
        // System.out.println(result);

        if(root.length==1 && root[0]==-1){
            System.out.println("imaginary");

        }else{
         System.out.println(root[0]+" "+root[1]);
        }

    }
    
}
