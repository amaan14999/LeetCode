class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i = 1; i < n - 1;){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                int count = 1; //Default value 1 coz we need to include the peak element as well in the length of longest Mountain array
                int j = i;
                while(j > 0 && arr[j] > arr[j - 1]){
                    j--;
                    count++;
                }
                

                while(i < n - 1 && arr[i] > arr[i + 1]){
                    i++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
            else{
                i++;
            }
        }
        return ans;
    }
}