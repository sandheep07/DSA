
import java.util.Arrays;

public class Shufflearray {


    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,2};
        int n=3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0; i < n;++i){
            arr[2*i]= nums[i];
            arr[2*i+1]= nums[n+i];
        }
    return arr;

    }



}

