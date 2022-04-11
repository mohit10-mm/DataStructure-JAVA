public class Circular_linkedlist_implementation {
    Node head, tail;     // reference variable pointing to node in linked list, initally null
    class Node{         // linked list has two parts one is data and other is address of next node 
        int data;
        Node next;

        Node(int data){   // node creation (node is created which has data and address to next node which is in next variable) 
            this.data = data;
        }
    }

    void insertElements(int data){       //inserting elements into linked list
        Node newNode = new Node(data);   //creating an object of node class(because it is the node we want to insert which contains data nad address to next node)
        if(head == null){                // when linked list is empty
            head = newNode;
            tail = newNode;
            tail.next = newNode;   // as it is circular linkedlist
        
        }
        else{                    // when there is already a node in linked list
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void displayElements() {
        Node n1 = head; 
        if(tail == null && head == null) {   // when linked list is empty
            System.out.println("circular linked list is empty");

        }
        else{
            do{
                System.out.println(n1.data);
                n1 = n1.next;         // we can use ++ operator in linxed list , so to increment we use next
            }while(n1 != head);  // iterate until we reach the head or end of linked list 
        }
   
    }
    
    void deleteElements() {        // head is deleted in circular linked list
            if(tail != head) {     // head and tail are not eqal there are certain elements in the linked list
                head = head.next;  // head is deleted 
                tail.next = head;  // tail  will be new head 
            }
            else{                 // when there are no elements in linked list
                head = tail = null;
               // System.out.println(" linked list is empty");
            }
    }
    public static void main(String args[]) {
        Circular_linkedlist_implementation list1 = new  Circular_linkedlist_implementation();
        list1.insertElements(2);
       // list1.insertElements(4);
       // list1.insertElements(8);
        list1.displayElements();
        list1.deleteElements();
        list1.displayElements();
        
    }
    
}
