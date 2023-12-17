import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){

    boolean swapped;
     //run the steps for n-1
 
    // number of passes
     for(int  i=0;i<arr.length-1;i++){
         swapped=false;
         for(int j=1;j<=arr.length-i-1;j++){
            //swap if previous item is smaller - descending order
            //swap if previous item is bigger - ascending order
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                swapped=true;
            }


         }
         if(!swapped){
             break;
         }
     }

    }
}
