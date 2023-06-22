class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int lh=height[l];
            int rh=height[r];
            int minh=Math.min(lh,rh);
            max=Math.max(max, (minh*(r-l)));

            if(lh<rh){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}