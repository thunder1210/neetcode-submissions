class MinStack {

    private int[] stack = new int[0];

    public MinStack() {
    }
    
    public void push(int val) {
        int[] temp = new int[stack.length + 1];
			for (int i = 0; i <= stack.length; i++) {
				if (i == stack.length) {
					temp[i] = val;
				} else {
					temp[i] = stack[i];
				}
			}
			stack = temp;
    }
    
    public void pop() {
        if (stack.length == 0) {
				return;
			} else {
				int[] temp = new int[stack.length - 1];
				for (int i = 0; i < stack.length - 1; i++) {
					temp[i] = stack[i];
				}
				stack = temp;
			}
    }
    
    public int top() {
        return stack[stack.length - 1];
    }
    
    public int getMin() {
        int[] temp = stack.clone();
			Arrays.sort(temp);
			System.out.println("the minium is " + temp[0]);
			return temp[0];
    }
}
