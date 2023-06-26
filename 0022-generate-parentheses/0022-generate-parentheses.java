class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generatePara(n,0,0,"",ans);
        return ans;
    }
    
    public void generatePara(int n, int open, int close, String s, ArrayList<String> ans){
        
        if(open == n && close == n){
            ans.add(s);
            return;
        }
        
        if(open<n){
            generatePara(n, open+1, close, s+"(", ans);
        }
        
        if(close<open){
            generatePara(n, open, close+1, s+")", ans);
        }
    }
}