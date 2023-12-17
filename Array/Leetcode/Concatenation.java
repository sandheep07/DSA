import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }


   static public int[] getConcatenation(int[] nums) {
        
        int[] arr=new int[nums.length*2];
        for(int i=0;i<nums.length*2;i++){
            arr[i]=nums[i%nums.length];   
        }
        
        return arr;
    }
}
