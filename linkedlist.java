import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class linkedlist {
    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<>(); //creation of object l1 of the class Linkedlist
        
        l1.add(3);  // insertion at 0th index
        l1.add(7);  // insertion at 1th index
        l1.add(10); // insertion at 2nd index
        l1.add(0,2);  // used for updation 

        // remove elements from linkedlist
        l1.remove(2);  // remove the element from linkedlist
        //l1.removeFirst();  //remove 1st element 
        //l1.removeLast();     //remove the element fromparticular index

        // iterator class to make linked list iterable
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        // to know the size of linked list
        System.out.println();
        System.out.println(l1.size());

        // search element in linked list using method contain
        boolean b1 = l1.contains(10);
        System.out.println(b1);

        // copy elements from stack to linked list

        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();

        s1.push("i");
        s1.push("my");
        s1.push("mohit");
        l2.addAll(s1);           // add can be used to copy elements from stack to linkedlist

        // iterator class to make linked list iterable
        Iterator it1 = l2.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
       }
    }

}
