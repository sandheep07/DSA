/* Given a string s, find the length of the longest substring without repeating characters. */

/* input: abcbcaba 
   ouput: 3 */

class LongestSubstring{
    public static void main(String[] args) {
       
        findLongestSubstring("abcbcabab");
    }

    public static void findLongestSubstring(String s){

        Integer chars[] = new Integer[128]; //total number of charectors allowed

        int left = 0 ; // left pointer
        int right= 0 ; // right pointer
        int res = 0 ; // result

        //move right pointer
        while(right < s.length()){
            
            char r = s.charAt(right);
            
            //index of right pointer
            Integer index = chars[r];

            //check whether charector is already present int the array
            if(index != null && index >= left && index < right){
                //move left index to one position after the repeated charector
                left=index+1;
            }

            //check with the previous result
            res=Math.max(res, right-left+1);
            
            //update the array with the current element
            chars[r]=right;

            //increment right pointer
            right++;
            
        }

        //print the result

        System.out.println(res);
    }

    
    

}