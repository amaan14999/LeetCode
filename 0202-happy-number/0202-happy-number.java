class Solution {
    public boolean isHappy(int n) {
        int s=0;
        while(n>0)
        {
            int a=n%10;
            s+=a*a;
            n/=10;
        }
            if(s==1)
            return true;
            else if(s==4)// because the nearest square to 1 is 4. So, after the loop ends, s can't be 2 or 3
            return false;
        
        return isHappy(s);
    }
}