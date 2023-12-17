public class Searchinrange {
    public static void main(String args[]){

        int[] arr = {1,2,5,28,18};
        int targetelement=5;

        System.out.println(linearsearch(arr, targetelement,1,2));

    }

    //search in the index
    //return -1 if item not found

    static int linearsearch(int arr[],int targetelement,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element=arr[i];
            if(element==targetelement){
                return i;
            }
        }

        // for (int element : arr) {
        //     if(element==targetelement)
        //     return element;
        // }

        return -1;
    }
}
