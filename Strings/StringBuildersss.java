import java.util.*;
public class StringBuildersss {
    public static void main(String args[]){
       

          StringBuilder sb = new StringBuilder("dcba");
          System.out.println(sb.append("efg"));
          System.out.println(sb.reverse());
          sb.setCharAt(1,'h');
          System.out.println(sb);

          sb.delete(0,2);
          System.out.println(sb);

          sb.insert(2,"98uidaofaksdgAsfn");
          System.out.println(sb);
    }
    
}
