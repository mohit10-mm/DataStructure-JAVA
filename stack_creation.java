import java.util.Iterator;
import java.util.Stack;

public class stack_creation {
     public static void main(String[] args){
         Stack<Integer> s1 = new Stack<>();
         
         // inserting element into stack
         s1.push(5);
         s1.push(2);
         s1.push(8);
         s1.push(7);
         System.out.println(s1);
        
        // delete operation on stack
         s1.pop();
         System.out.println(s1);
         s1.pop();
         System.out.println(s1);

         //peak operation on stack
         System.out.println(s1.peek());
         
         //s1.pop();
         //s1.pop();

         //to check if stack is empty
         boolean status = s1.empty();
         System.out.println(status);

         // to search index of an element 
         int indexfound = s1.search(2);
         System.out.println(indexfound);

         //iteration over stack
         Iterator it = s1.iterator();
         while(it.hasNext()){
             Object s2 = it.next();
             System.out.print(s2+" ");
         }
         System.out.println();
         
         //to get size of stack
         int l1=s1.size();
         System.out.println(l1);

         // sort over stack
         s1.sort(null);
         System.out.println(s1);

     }
}
