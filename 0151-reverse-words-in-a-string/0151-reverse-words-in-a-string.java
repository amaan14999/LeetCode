class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int newWord=0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(newWord > 0){
                    sb.append(s.substring(i + 1, i + newWord + 1));
                    sb.append(" ");
                }
                newWord=0;
            } else{
                newWord++;
            }
        }
        if(newWord > 0){
            sb.append(s.substring(0, newWord));
        }else{
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}