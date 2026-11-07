


class Solution {
    public int calPoints(String[] operations) {

        // Stack banaya jisme hum valid scores store karenge
        Stack<Integer> st = new Stack<>();

        // Operations array ke har element ko ek-ek karke check karenge
        for (String op : operations) {

            // Agar operation C hai toh last score cancel karna hai
            if (op.equals("C")) {

                // Stack ka last score remove kar do
                st.pop();
            }

            // Agar operation D hai toh last score ka double add karna hai
            else if (op.equals("D")) {

                // peek() se last score milega, remove nahi hoga
                int top = st.peek();

                // Last score ka double calculate karke Stack mein add karo
                st.push(top * 2);
            }

            // Agar operation + hai toh last two scores ka sum add karna hai
            else if (op.equals("+")) {

                // Last score temporarily remove karke store karo
                int top = st.pop();

                // Ab peek() se second last score milega
                int second = st.peek();

                // Pehle wala last score wapas Stack mein daal do
                st.push(top);

                // Dono scores ka sum calculate karke add karo
                st.push(top + second);
            }

            // Agar C, D, + nahi hai toh operation ek number hai
            else {

                // String number ko Integer mein convert karke add karo
                st.push(Integer.parseInt(op));
            }
        }

        // Final scores ka total calculate karne ke liye variable
        int sum = 0;

        // Jab tak Stack empty nahi hota tab tak scores nikalte raho
        while (!st.isEmpty()) {

            // Last score nikalo aur total mein add karo
            sum = sum + st.pop();
        }

        // Final total score return karo
        return sum;
    }
}
