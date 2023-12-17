import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){

        int i=0;

        while(i < arr.length) {
            int correctindex = arr[i] - 1;
            if(arr[i] != arr[correctindex]){
                 swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
