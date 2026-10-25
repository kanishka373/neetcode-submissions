class Solution {
    public String reverseWords(String s) {


        // String ko character array mein convert kiya
        char[] arr = s.toCharArray();


        // Current word ka starting point
        int start = 0;


        // Puri string traverse karo
        for (int i = 0; i < arr.length; i++) {


            // Agar space mil gaya
            if (arr[i] == ' ') {


                // start se i-1 tak word reverse karo
                reverse(arr, start, i - 1);


                // Next word space ke baad start hoga
                start = i + 1;
            }
        }


        // Last word ko reverse karo
        reverse(arr, start, arr.length - 1);


        // Character array ko wapas String bana do
        return new String(arr);
    }


    // Ek word ko reverse karne ka function
    private void reverse(char[] arr, int left, int right) {


        // Jab tak pointers mil nahi jaate
        while (left < right) {


            // Left aur right characters swap karo
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            // Pointers andar lao
            left++;
            right--;
        }
    }
}
