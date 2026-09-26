class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int n = arr.length;
        int start = 0, end = 0, sum = 0, max = 0;
        while(end<n) {
            sum = sum +arr[end] ; //Engaging the end
            if(end - start+1 == k){
                if(sum >max){
                    max = sum;
                }
                sum =sum - arr[start]; //Disengaging the start
                start++;
            }
            end++;
            }
            return max;
        }
    }
