class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int startingRow = 0, endingRow = row-1;
        int startingCol = 0, endingCol = col-1;
        int count=0, total = row*col;
        while(count<total) {
            for(int index= startingCol; index<=endingCol && count<total; index++) {
                spiralOrder.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            for(int index= startingRow; index<=endingRow && count<total; index++) {
                spiralOrder.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            for(int index=endingCol; index>=startingCol && count<total; index--) {
                spiralOrder.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;
            for(int index=endingRow; index>=startingRow && count<total; index--) {
                spiralOrder.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return spiralOrder;
    }
}