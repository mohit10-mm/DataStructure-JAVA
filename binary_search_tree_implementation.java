
class Node{          
    char key;
    Node left, right;

    Node(char key){        // construct of node class
        this.key = key;
    }
}

class BinarySolution{      
    Node root;
    void insertkey(char key){              // insert function to insert elements into binary search tree
        root = insertInTree(root, key);   // insert in tree function is formed to satisfy the condition of BST
    }

    Node insertInTree(Node root, char key) {   // insert in tree function is formed to satisfy the condition of BST
        if( root == null) {                    // if no element i.e 1st element, than made it root node
            root = new Node(key);
            return root;
        }
        if(key<root.key) {                     //  if element is less than node element it shoud move to left side
            root.left = insertInTree(root.left, key);
        }
        else if(key>root.key){                 // if element is greater than node element it shoud move to right side
            root.right = insertInTree(root.right, key);
        }
        return root;                           // else return the root node
    }
    
    void preoderTraversal(Node root){         // we pass root node of every binary tree i.e it is a recursive call
        if(root!= null){                      // condition chek till we reach the end of leaf node
            System.out.print(root.key+" ");   // display root node
            preoderTraversal(root.left);      // recoursive call to left
            preoderTraversal(root.right);     // recoursive call to right
            
        }
    }

}

public class binary_search_tree_implementation {
     public static void main(String[] args) {
         BinarySolution t1 = new BinarySolution();   // creating object for the binarysolution class
        t1.insertkey('c');
        t1.insertkey('i');
        t1.insertkey('b');
        t1.insertkey('g');
        t1.insertkey('m');
        t1.insertkey('a');

        t1.preoderTraversal(t1.root);
        
    }
    
}
