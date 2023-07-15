class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char sign='+';
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int val=0;
                while(i<s.length()&&Character.isDigit(s.charAt(i)))
                {
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(sign=='+')
                {
                    stack.push(val);
                }
                else if(sign=='-')
                {
                    stack.push(-val);
                }
                else if(sign=='*')
                {
                    stack.push(stack.pop()*val);
                }
                else if(sign=='/')
                {
                    stack.push(stack.pop()/val);
                }
                
            }
            else if(ch!=' ')
                sign=ch;
        }
        int sum=0;
            while(!stack.empty()) sum+=stack.pop();
        return sum;
    }
}