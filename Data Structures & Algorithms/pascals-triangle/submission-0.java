


class Solution {
    public List<List<Integer>> generate(int numRows) {

        // Final answer store karega
        List<List<Integer>> result = new ArrayList<>();

        // Har row banayenge
        for (int i = 0; i < numRows; i++) {

            // Ek nayi row
            List<Integer> row = new ArrayList<>();

            // Har row me i+1 elements honge
            for (int j = 0; j <= i; j++) {

                // First aur last element hamesha 1 hota hai
                if (j == 0 || j == i) {
                    row.add(1);
                }

                // Beech wale element = upar wali row ke do elements ka sum
                else {
                    row.add(result.get(i - 1).get(j - 1)
                          + result.get(i - 1).get(j));
                }
            }

            // Current row ko final answer me add karo
            result.add(row);
        }

        return result;
    }
}
        
    