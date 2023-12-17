package LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.printLL();
        list.duplicates();
        list.printLL();

        LL first = new LL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);
        LL second = new LL();
        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(5);
        
        System.out.println();
        LL ans = LL.mergeSorted(first, second);
        ans.printLL();



    }
   
}
