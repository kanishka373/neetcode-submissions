

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // Closing bracket
            else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {

                    st.pop();
                } 
                else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}