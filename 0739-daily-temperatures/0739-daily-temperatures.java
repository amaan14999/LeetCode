class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];
        
        for(int i = len-1; i>=0; i--){
            /*ppopping all indices with lower than or equal
            temperature than current index*/
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            /* if the stack still has elements,
            then next warmer temperature exist*/
            if(!st.isEmpty()){
                res[i] = st.peek() - i;
            }
            // inserting current index in the stack
            st.push(i);
        }
        return res;
    }
}