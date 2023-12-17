public class Missingnumber {
    public static void main(String[] args) {
        
        int[] arr = {0,1,3};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        
        int n=arr.length;
        int i=0;
        
        while(i<n){
            int correctindex=arr[i];
            if(arr[i] < arr.length && arr[i]!=arr[correctindex]){
                  int temp = arr[i];
                  arr[i] = arr[correctindex];
                  arr[correctindex] = temp;
            }else{
                i++;
            }         
        }
        
        for(int index=0;index<n;index++){
            if(index != arr[index]){
                return index;
            }
        }
        
        return arr.length;
    
    }
}
