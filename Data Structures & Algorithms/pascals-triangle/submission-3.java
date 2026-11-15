


class Solution {
    public List<List<Integer>> generate(int numRows) {

       
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                
                if (j == 0 || j == i) {
                    row.add(1);
                }

                
                else {
                    List<Integer> prevRow = result.get(i - 1);
                    int topLeft  = prevRow.get(j - 1);
                    int topRight = prevRow.get(j);
                    row.add(topLeft + topRight);
                }
            }
            result.add(row);
        }

        return result;
    }
}
        
    