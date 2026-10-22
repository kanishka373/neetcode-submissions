class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0;//pehle element ko unique maan liya.
      for(int j=1;j<nums.length;j++)//doosre element se checking shuru.
      {
        if(nums[i]!=nums[j])//agar dono different hain, toh naya unique element mila.
        {
            i++;
            nums[i]=nums[j];//unique element ke liye next position banao aur usme value copy karo.
        }
       
      }
      return i+1;
    }
}