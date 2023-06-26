class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2 = new Stack<Character>();
        st1 = insertStack(st1, s);
        st2 = insertStack(st2, t);
        return st1.equals(st2);
    }
    
    public Stack insertStack(Stack st, String s){
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c == '#'){
                st.pop();
            }
            else
            {
                if(c!='#'){
                    st.push(c);
                }
            }
        }
        return st;
    }
}