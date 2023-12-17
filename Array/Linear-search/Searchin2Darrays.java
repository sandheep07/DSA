import java.util.Arrays;

class Searchin2Darrays{
    public static void main(String[] args) {
        
        int[][] arr={{1,6,4},{2,3,5}};
        int target=6;
        int[] ans= search2darray(arr, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }

    static int[] search2darray(int arr[][],int target){
        for (int row = 0; row < arr.length; row++) {
            for(int col=0;col<arr[row].length;col++){
                 if(arr[row][col]==target){
                        return new int[]{row,col};
                 }
            }
        }
        return new int[]{-1,-1};
    }

    
    static int max(int arr[][]){

        int max=Integer.MIN_VALUE;
        // for (int row = 0; row < arr.length; row++) {
        //     for(int col=0;col<arr[row].length;col++){
        //          if(arr[row][col]>max){
        //                max=arr[row][col];
        //          }
        //     }
        // }

        for(int[] row:arr){
            for (int element : row) {
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}