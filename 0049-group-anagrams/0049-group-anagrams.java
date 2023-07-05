class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for( int i = 0; i<strs.length; i++){
            String st1 = strs[i];
            char[] c = st1.toCharArray();
            Arrays.sort(c);
            String str = new String(c);

            if(map.containsKey(str)){
                map.get(str).add(st1);
            }
            else{
                map.put(str, new ArrayList<>());
                map.get(str).add(st1);
            }
        }
        return new ArrayList<>(map.values());
    }
}