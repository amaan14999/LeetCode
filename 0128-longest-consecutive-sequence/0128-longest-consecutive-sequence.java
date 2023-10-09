class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int count = 1, longest = 1;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int x = num;

                while(set.contains(x + 1)){
                    count++;
                    x = x + 1;
                }
                longest = Math.max(longest, count);
            }
            count = 1;
            
        }
        return longest;
    }
}