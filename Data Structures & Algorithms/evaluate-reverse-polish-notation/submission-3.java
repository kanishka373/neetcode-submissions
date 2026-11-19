
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {

            if (!token.equals("+") &&  !token.equals("-") &&
                !token.equals("*") && !token.equals("/")) {
                st.push(Integer.parseInt(token));
            }

            else {

                // Operator aaya toh pehle second number nikalo
                int b = st.pop();

                // Phir first number nikalo
                int a = st.pop();

                // Operation ke according calculation
                if (token.equals("+")) {
                    st.push(a + b);
                }

                else if (token.equals("-")) {
                    st.push(a - b);
                }

                else if (token.equals("*")) {
                    st.push(a * b);
                }

                else if (token.equals("/")) {
                    st.push(a / b);
                }
            }
        }

       
        return st.pop();
    }
}
