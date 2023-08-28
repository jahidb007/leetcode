class MyStack {

      int i;
    List<Integer> data;
    public MyStack() {
        data = new ArrayList<>();
        i = 0;
    }

    public void push(int x) {
       if(data.size() < i){
           data.add(i);
       }else data.add(i,x);

        i++;
    }

    public int pop() {
        i--;
       return data.get(i);

    }

    public int top() {
        return data.get(i-1);
    }

    public boolean empty() {
        if(i == 0){
            return true;
        }else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */