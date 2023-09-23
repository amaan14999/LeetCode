class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Arrays.sort(arr);
        // int min = Integer.MAX_VALUE;
        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i] - arr[i - 1] < min)
        //     min = arr[i] - arr[i - 1];
        // }
        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i] - arr[i - 1] == min){
        //         List<Integer> sublist = new ArrayList<>();
        //         sublist.add(arr[i - 1]);
        //         sublist.add(arr[i]);
        //         ans.add(sublist);
        //     }
        // }
        // return ans;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            int diff = arr[i + 1] - arr[i];

            if(diff < min){
                min = diff;
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
            else if (diff == min){
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}