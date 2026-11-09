
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack next greater elements find karne ke liye
        Stack<Integer> st = new Stack<>();

        // HashMap mein number aur uska next greater store karenge
        HashMap<Integer, Integer> map = new HashMap<>();

        // nums2 ke har element ko traverse karenge
        for (int num : nums2) {

            // Jab tak Stack empty nahi aur current number
            // Stack ke top se bada hai
            while (!st.isEmpty() && num > st.peek()) {

                // Stack ka top remove karo
                int top = st.pop();

                // Current number uska next greater element hai
                map.put(top, num);
            }

            // Current number ko Stack mein add karo
            st.push(num);
        }

        // Jinke liye greater element nahi mila unka answer -1
        while (!st.isEmpty()) {

            map.put(st.pop(), -1);
        }

        // Final answers store karne ke liye array
        int[] ans = new int[nums1.length];

        // nums1 ke har element ka answer find karo
        for (int i = 0; i < nums1.length; i++) {

            ans[i] = map.get(nums1[i]);
        }

        // Final answer return karo
        return ans;
    }
}
