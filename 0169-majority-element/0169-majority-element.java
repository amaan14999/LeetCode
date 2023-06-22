// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }
class Solution{
    public int majorityElement(int[] nums){
        int count=0;
        int el=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                el=nums[i];
            }
            if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }
}