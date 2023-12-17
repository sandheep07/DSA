import java.util.List;
import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {

        System.out.println(subset(new int[]{1,2,3,4,5,6,7,8,9,10,11,12}));
        
    }


    static List<List<Integer>> subset(int[] arr){ 

        // creating a list of elements where type of elements is also a list
        List<List<Integer>>  outer = new ArrayList<>();
        //adding an empty list in the outer lsit
        outer.add(new ArrayList<Integer>());

        for(int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;

    }
}
