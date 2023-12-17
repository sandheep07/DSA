import java.util.Arrays;

public class Mergesort {
    
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        // 5 3 2 1 4
        // 53      214
        // 5 3
        // 35
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;


        int[] leftSort = sort(Arrays.copyOfRange(arr, 0, mid)); 
        int[] rightSort = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftSort,rightSort);
    }



    static int[] merge(int[] leftSort,int[] rightSort){
        int[] mergedArray = new int[leftSort.length+rightSort.length];

        //for left array
        int i=0;
        //for right array
        int j=0;
        //for merged array
        int k=0;

        while(i < leftSort.length && j < rightSort.length){

            if(leftSort[i] < rightSort[j]){
                mergedArray[k] = leftSort[i];
                i++;
                k++;
            }else{
                mergedArray[k] = rightSort[j];
                j++;
                k++;
            }
        }


        // 1,3,4,5,6

        //if some left over is present 

        while(i<leftSort.length){
            mergedArray[k] = leftSort[i];
            i++;
            k++;
        }

        while(j<rightSort.length){
            mergedArray[k] = rightSort[j];
            j++;
            k++;
        }

        return mergedArray;


    }
}
