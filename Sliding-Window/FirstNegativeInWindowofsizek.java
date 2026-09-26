class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        
        int n = arr.length;
        int start = 0, end = 0;
        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        
        while (end < n) {
            
            if (arr[end] < 0) {
                q.offer(arr[end]);
            }
            
            if (end - start + 1 == k) {
                
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(q.peek());
                }
                
                if (!q.isEmpty() && arr[start] == q.peek()) {
                    q.poll();
                }
                
                start++;
            }
            
            end++;
        }
        
        return ans;
    }
}
