import java.util.ArrayList;

//program to skip string a particular string 

public class Skip {
    public static void main(String[] args) {
        skip("", "baccda");
        System.out.println(skipApple("bbapplecd"));
        ArrayList<String> list = new ArrayList<>();
        subSequence("","abcd",list);
        System.out.println(list);
    }

    static void skip(String p, String str) {
        if (str == "") {
            System.out.println(p);
            return;
        }

        if (str.charAt(0) == 'a') {
            skip(p, str.substring(1));
        } else {
            skip(p + str.charAt(0), str.substring(1));
        }
    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    static ArrayList<String> subSequence(String p,String str,ArrayList<String> list) {
         
           
         
            if(str.isEmpty()){
                list.add(p);
                return list;
            }

            char ch = str.charAt(0);
            subSequence(p+ch, str.substring(1),list);
            subSequence(p, str.substring(1),list);


            return list;

        
           
    }
}
 