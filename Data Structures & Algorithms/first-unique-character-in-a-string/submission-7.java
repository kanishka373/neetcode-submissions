
class Solution {
    public int firstUniqChar(String s) {
int [] count=new int[26];
for(int i=0;i<s.length();i++)//traverse kro
{
    count[s.charAt(i)-'a']++;//freq count kro
}

for(int i=0;i<s.length();i++)
{
    if(count[s.charAt(i)-'a']==1)//check krna hai count 1 hai ya ni
    {
        return i;//hai toh return kro
    }
}
return -1;
    }
}
