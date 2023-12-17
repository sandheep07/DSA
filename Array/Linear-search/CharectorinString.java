public class CharectorinString {
     public static void main(String[] args) {
         String name="Arun";
         char target='n';
         System.out.println(searchchar(name, target));
     }

     static boolean searchchar(String name,char target){
        if(name.length()==0)
        return false;

        // for (int i = 0; i < name.length(); i++) {
        //     if(target==name.charAt(i))
        //     return true;
        // } 

        for (char element : name.toCharArray()) {
            if(element==target){
                return true;
            }
        }

        return false;

     }
}
