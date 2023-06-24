class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && !st.empty() && st.peek()=='('){
                st.pop();
            }
            else if(s.charAt(i)=='}' && !st.empty() && st.peek()=='{'){
                st.pop();
            }
            else if(s.charAt(i)==']' && !st.empty() && st.peek()=='['){
                st.pop();
            }
            else
            return false;
        }
        return st.empty();
    }
}