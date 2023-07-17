class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int k=0;
        switch(ruleKey)
        {
            case "type":
                k=0;
                break;
            case "color":
                k=1;
                break;
            case "name":
                k=2;
                break;
        }
        for(int i=0;i<items.size(); i++)
        {
            if(items.get(i).get(k).equalsIgnoreCase(ruleValue))
                c++;
        }
        return c;
    }
}