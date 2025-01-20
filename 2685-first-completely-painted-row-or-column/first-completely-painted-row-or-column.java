class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowFreq = new int[m];
        int[] colFreq = new int[n];
        HashMap<Integer, int[]> freq = new HashMap<>();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                freq.put(mat[i][j], new int[]{i, j});
            }
        }

        for(int i=0; i<arr.length; i++) {
            int[] index = freq.get(arr[i]);
            int r = index[0];
            int c = index[1];
            rowFreq[r]++;
            colFreq[c]++;

            if(rowFreq[r] == n || colFreq[c] == m) {
                return i;
            }

        }
        return -1;

    }
}