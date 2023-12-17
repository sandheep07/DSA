public class FindMin {
    
    public static void main(String[] args) {
        int[] arr = {1,2,5,28,18};
        System.out.println(findmin(arr));
    }

    static int findmin(int[] arr) {

        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
               ans=arr[i];
            }
        }
        return ans;
    }
}
