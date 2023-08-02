class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);//sort the array to have all the duplicates side 
                        //by   side so that we can avoid having a duplicate
                        //subset.
        List<List<Integer>> ansList = new ArrayList<>();
        subSet(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }
    public void subSet(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = ind; i < nums.length; i++){
            if(i != ind && nums[i] == nums[i-1])
            continue;

            ds.add(nums[i]);
            subSet(i+1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }
}