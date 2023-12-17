import java.util.ArrayList;

public class ArrayOperations {
    public static void main(String[] args) {
        int fact = fact(5);
        int sum = sumofdigits(12);
        int prod = prodofdigits(123);
        int[] arr = {5,4,1,2,3};
        boolean order= checkOrder(arr,0);
        boolean linearsearch = linearSearch(arr,5,0);
        ArrayList<Integer> ans = findIndex(arr, 5, 0);
        int search = search(arr, 2, 0,arr.length-1);
        System.out.println("\nCheck whether array is in ascending order using recursion: " +linearsearch);
        System.out.println("\nCheck whether element exist in the given array using recursion: " +order);
        System.out.println("\nThe product of digits using recursion: " + prod);
        System.out.println("\nThe sum of digits using recursion:" + sum);
        System.out.println("\nThe factorial using recursion :" + fact);
        System.out.println("\nFind all index  :" + ans);
        System.out.println("\nCheck whether array is in ascending order using recursion: " + search);
        
        
    }

    static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }

    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        
        return n%10+sumofdigits(n/10);

    }

    
    static int prodofdigits(int n){
        if(n==0){
            return 1;
        }
        
        return n%10*prodofdigits(n/10);

    }

    static int numberOfSteps(int num) {
        
        return helper(num,0);
    }

    static int helper(int num,int steps){

        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2, steps+1);
        }else{
            return helper(num-1, steps+1);
        }

    }
    
    static boolean checkOrder(int[] arr,int i){

 
        if(i==arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && checkOrder(arr, i+1);

    }

    static boolean linearSearch(int[] arr,int target,int i){
        if(i==arr.length-1){
            return false;
        }

        return arr[i] == target || linearSearch(arr, target, i+1);
    }
    
    static ArrayList<Integer> findIndex(int[] arr,int target,int i){

        ArrayList<Integer> list = new ArrayList<>();

        if(i==arr.length){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> ansfromabovecalls= findIndex(arr, target, i+1);
        list.addAll(ansfromabovecalls);

        return list;

    }
    
    static int search(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }

        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return search(arr, target, s, m-1);
            }else{
                 return search(arr, target, m+1, e);
            }
        }

        if(target>=arr[m] && target<=arr[e]){
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }

    
}
