 public class Solution {
    int missingNum(int arr[]) {
        // code here
      
      int n= arr.length+1;
      int total=n*(n+1)/2;
      int sum=0;
      for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
   return  total-sum;
  
}
}