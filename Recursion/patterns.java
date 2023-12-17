import java.util.Arrays;

public class patterns {
     public static void main(String[] args) {
         triangle(4, 0);
         int[] arr = {4,3,2,1};
         bubblesort(arr,arr.length-1, 0);
         System.out.println(Arrays.toString(arr));
     }

     static void triangle(int row,int col){
        if(row==0){
            return;
        }
        if(col>=row){
            row=row-1;
            col=0;
            System.out.println();
            triangle(row, col);
        }else{
           System.out.print("*");
           triangle(row, col+1);
        }
       
     }

     static void bubblesort(int arr[],int row,int col){
        if(row==0){
            return;
        }
        if(col>=row){


            bubblesort(arr, row-1, 0);
             
        }else{
           if(arr[col]>arr[col+1]){
               int temp = arr[col];
               arr[col] = arr[col+1];
               arr[col+1] = temp;
           }

           bubblesort(arr, row, col+1);
        }
       
     }
}
