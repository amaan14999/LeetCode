class Solution {
    public String restoreString(String s, int[] indices) {
        int temp = 0;
        char ch [] = new char[indices.length];
        for(int i =0; i<indices.length;i++)
        {
            temp=indices[i];
            ch[temp] = s.charAt(i);
        }
        String str = new String(ch);
        return str;
    }
}