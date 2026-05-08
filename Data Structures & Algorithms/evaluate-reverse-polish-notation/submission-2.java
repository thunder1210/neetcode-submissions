class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length < 3) {
			return Integer.valueOf(tokens[0]);
		}
        int temp = 0;
		Stack<String> stack = new Stack<String>();
		List<String> operators = Arrays.asList("+", "-", "*", "/");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(stack);
			if (!operators.contains(tokens[i])) {
				stack.push(tokens[i]);
			} else {
				String pop1 = stack.pop();
				String pop2 = stack.pop();
				switch (tokens[i]) {
				case "+":
					temp = Integer.valueOf(pop2) + Integer.valueOf(pop1);
					break;
				case "-":
					temp = Integer.valueOf(pop2) - Integer.valueOf(pop1);
					break;
				case "*":
					temp = Integer.valueOf(pop2) * Integer.valueOf(pop1);
					break;
				case "/":
					temp = Integer.valueOf(pop2) / Integer.valueOf(pop1);
					break;
				default:
					break;
				}
				stack.push(String.valueOf(temp));
			}
		}
		return temp;
    }
}
