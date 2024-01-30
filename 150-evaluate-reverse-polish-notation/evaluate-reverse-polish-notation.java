class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        int result = 0;
        for(String s : tokens){
            if(s.equals("*")){
                st.push(st.pop() * st.pop());
            }
            else if(s.equals("+")){
                st.push(st.pop() + st.pop());
            }
            else if(s.equals("-")){
                 st.push(-st.pop() + st.pop());
            }
            else if(s.equals("/")){
                int j =st.pop();
                int i = st.pop();
                result = i / j;
                st.push(result);
            }
            else st.push(Integer.valueOf(s));
        }

        return st.pop();
    }
}