import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,12},
            {18,19,20},
          };
        int target=20;
        System.out.println(Arrays.toString(search(matrix, target)));
}

    static int[] search(int[][] matrix, int target){
         
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }else if(matrix[r][c] < target){
                r++;
            }else if(matrix[r][c]>target){
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
