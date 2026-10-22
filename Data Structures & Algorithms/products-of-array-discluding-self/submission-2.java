class Solution {
    public int[] productExceptSelf(int[] nums) {
int n=nums.length; //➡️ Array ki length.
        int[] ans=new int[n]; //➡️ Final answer store karne ke liye naya array.
        for(int i=0;i<n;i++) //➡️ Decide karo kis index ko ignore karna ha
        {
            int product=1; // ➡️ Har i ke liye multiplication dobara start hoga, isliye 1 se start karte hain.
            for(int j=0;j<n;j++) //Poora array traverse karo
            {
                if(i!=j) //➡️ Agar ye wahi index nahi hai jise ignore karna hai, tabhi multiply karo.
                {
                    product=product*nums[j]; //➡️ Baaki sab elements ka product nikaalo.
                }
            }
            ans[i]=product;//➡️ Jo answer mila, usko us index par store kar do.
        }
        return ans;
    }
}