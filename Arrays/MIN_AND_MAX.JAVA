
// Given an array arr. Your task is to find the minimum and maximum elements in the array.

// Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

// Input: arr[] = [3, 2, 1, 56, 10000, 167]
// Output: 1 10000
// Explanation: minimum and maximum elements of array are 1 and 10000.

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
      
        // Code Here
        int small= Integer.MAX_VALUE;
        int large= Integer.MIN_VALUE;
      
      
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return new  Pair(small , large);
    }
}
