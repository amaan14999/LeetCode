class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> next_greatest = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int num : nums2){
            while(!st.isEmpty() && st.peek()<num){
                next_greatest.put(st.pop(), num);
            }
            st.push(num);
        }
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = next_greatest.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}