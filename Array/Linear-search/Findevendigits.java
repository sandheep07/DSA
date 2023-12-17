public class Findevendigits {
    public static void main(String[] args) {

        int[] arr={12,23,545,2,3};
        findNumbers(arr);
        
    }
   
        static int findNumbers(int[] nums) {
            
          int count=0;
          for(int element:nums){
              if(String.valueOf(element).length()%2==0){
                  count++;
              }
          } 
          
          return count;
        
        }
    
}
