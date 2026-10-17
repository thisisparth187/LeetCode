class Solution {
    public static List<Integer> genRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<Integer>();
        ansRow.add((int)ans);
        for(int col = 1; col<row; col++){
            ans = ans * (row - col);
            ans = ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public List<Integer> getRow(int rowIndex) {
        return genRow(rowIndex+1);
    }
}