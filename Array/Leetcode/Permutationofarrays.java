import java.util.Arrays;

public class Permutationofarrays {
     
    public static void main(String[] args) {
        
        int[] nums= {0,2,5,3,1};
        int[] ans=buildArray(nums);
        System.out.println(Arrays.toString(ans));

    }

    static public int[] buildArray(int[] nums) {
        int i=0;
        int arr[] = new int[nums.length];
        for(int num:nums){
            arr[i] = nums[num];
            i++;
        }

        return arr;

    }
}
