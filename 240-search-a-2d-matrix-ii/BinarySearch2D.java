import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 11;
        int[] result = foundElement(array, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] foundElement(int[][] matrix, int target) {
        int r=0, c=matrix.length-1;
        while(r< matrix.length && c>=0) {
            if(matrix[r][c] == target)
                return new int[]{r,c};
            else if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return new int[0];
    }
}