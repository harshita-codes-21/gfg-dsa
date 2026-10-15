public class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int start = 0, end = 0, ans = 0;
        long sum = 0L;
        int n = a.length;

        while (end < n) {
            sum = sum + a[end];  // Add current element

            while (sum > k) {
                sum -= a[start]; // Remove element from left
                start++;
            }

            if (sum == k) {
                ans = Math.max(ans, end - start + 1); // Update max length
            }

            end++;
        }

        return ans;
    }
}
