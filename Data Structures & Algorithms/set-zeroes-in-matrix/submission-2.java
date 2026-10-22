
class Solution {
    public void setZeroes(int[][] matrix) {

        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> cols=new HashSet<>();

        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
            for(int row:rows)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[row][j]=0;
                }
            }
        
            for(int col:cols)
            {
                for(int i=0;i<m;i++)
                {
                    matrix[i][col]=0;
                }
            }
        }
    }
