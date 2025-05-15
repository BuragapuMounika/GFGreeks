public class Counts {
    public static void main(String args[]){
        int digit = 9861;
        int count=0;

        if(digit<0){
           System.out.println(" oops!");
        } else{
       int temp = Math.abs(digit);//9861

        if(temp==0){
            count =1;
        }else{
    while(temp>0){
       temp= temp /10;// updation of the temp
       count++;
    }
}
       System.out.println("the count of the digit is: "+ count);
       

    }
    
}
}
