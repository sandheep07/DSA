import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr={3,8,2,10,9,6};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

 
    

    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {


            // 5 4 3 2 1
            // check left side element is less than pivot
            while (arr[s] < pivot) {
                s++;
            }

            //check right side element is greater than pivot
            while (arr[e] > pivot) {
                e--;
            }

            //check start index and end index
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }

        //time for sorting the two halves
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
