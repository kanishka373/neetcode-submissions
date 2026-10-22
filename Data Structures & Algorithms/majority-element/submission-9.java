
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;//abhi koi candidate select nahi kiya.
        int count=0;//candidate ki current strength zero hai.
        for(int num:nums)//array ka har element ek-ek karke uthao.
        {
            if(count==0){//agar strength zero ho gayi, toh current number ko naya candidate banao.
               candidate=num;
            }
        
        if(num==candidate){
            count++;//same number mila toh count++.
        }
        else{
            count--;//different number mila toh count--.
        }
    }
    return candidate;//final candidate return karo.
    }
    }
        





