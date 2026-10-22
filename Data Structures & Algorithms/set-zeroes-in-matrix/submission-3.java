
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> cols=new HashSet<>();//empty hashset bnane h

        int m=matrix.length;
        int n=matrix[0].length;//length store kri isme
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)//check krn h ki row or col m zero h y ni
                {
                    rows.add(i);
                    cols.add(j);//agr h toh khali usme store krdenege jisse baad m zero bnaske
                }
            }
        }
            for(int row:rows)
            {
                for(int j=0;j<n;j++)//row ko zero bnayenge phele
                {
                    matrix[row][j]=0;
                }
            }
        
            for(int col:cols)
            {
                for(int i=0;i<m;i++)
                {
                    matrix[i][col]=0;//column ko zero bneynge phele
                }
            }
        }


    }

    
