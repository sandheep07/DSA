package Anonymous;

import java.util.*;
public class MergeWord {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);
        HashMap<Integer,Character> map = new HashMap<>();
        HashMap<Integer,Character> map2 = new HashMap<>();
        HashMap<Integer,Character> temp = new HashMap<>();

        String str1= sc.next();
        String str2 = sc.next();

        String str3 = "";

        for (int i = 0; i < str1.length(); i++) {
            temp.put(i, str1.charAt(i));
        }
        
        for ( int i = 0; i < str1.length(); i++) {
            map.put(i, str1.charAt(i));
        }

        for ( int i = 0; i < str2.length(); i++) {
            map2.put(i, str2.charAt(i));
        }


        for (int i = 0; i < str1.length(); i++) {
            if(map2.containsValue(str1.charAt(i))){
                map.remove(i);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if(temp.containsValue(str2.charAt(i))){
                map2.remove(i);
            }
        }

        for(Map.Entry<Integer,Character> entry: map.entrySet()){
            str3=str3+ entry.getValue();
        }

        for(Map.Entry<Integer,Character> entry: map2.entrySet()){
            str3=str3+ entry.getValue();
        }


        System.out.println(str3);

      

    }
}
