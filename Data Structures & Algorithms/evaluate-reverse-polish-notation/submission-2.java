

class Solution {
    public int evalRPN(String[] tokens) {

        // Numbers store karne ke liye Stack banaya
        Stack<Integer> st = new Stack<>();

        // Tokens array ke har element ko check karenge
        for (String token : tokens) {

            // Agar token operator hai toh calculation karenge
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                // Stack se second number nikalo
                int b = st.pop();

                // Stack se first number nikalo
                int a = st.pop();

                // Result store karne ke liye variable
                int result = 0;

                // Addition operation
                if (token.equals("+")) {
                    result = a + b;
                }

                // Subtraction operation
                else if (token.equals("-")) {
                    result = a - b;
                }

                // Multiplication operation
                else if (token.equals("*")) {
                    result = a * b;
                }

                // Division operation
                else if (token.equals("/")) {
                    result = a / b;
                }

                // Calculation ka result Stack mein add karo
                st.push(result);
            }

            // Agar operator nahi hai toh token number hai
            else {

                // String number ko Integer mein convert karke add karo
                st.push(Integer.parseInt(token));
            }
        }

        // Stack ke top par final answer hoga
        return st.pop();
    }
}
