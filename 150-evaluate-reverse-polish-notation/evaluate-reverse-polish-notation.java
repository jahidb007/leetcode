class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack();
        int result = 0;
        for(String s : tokens){
            if(s.equals("*")){
                int j = Integer.valueOf(st.pop());
                int i = Integer.valueOf(st.pop());
                result = i * j;
                st.push(String.valueOf(result));
            }
            else if(s.equals("+")){
                int j = Integer.valueOf(st.pop());
                int i = Integer.valueOf(st.pop());
                result = i + j;
                st.push(String.valueOf(result));
            }
            else if(s.equals("-")){
                int j = Integer.valueOf(st.pop());
                int i = Integer.valueOf(st.pop());
                result = i - j;
                st.push(String.valueOf(result));
            }
            else if(s.equals("/")){
                int j = Integer.valueOf(st.pop());
                int i = Integer.valueOf(st.pop());
                result = i / j;
                st.push(String.valueOf(result));
            }
            else st.push(s);
        }

        return Integer.valueOf(st.pop());
    }
}