
class Node {
    char key;  // 
    Node left, right; //left and right are of typr node

    Node(char key){  // defining constructor for node class
            this.key = key;

    }
}

class TreeTraversal{  //this class is used to write the code for inoder, preoder, postoder
    Node root;

    // preodertraversal
    void preoderTraversal(Node n){  // we pass root node of every binary tree i.e it is a recursive call
        if(n!= null){               // condition chek till we reach the end of leaf node
            System.out.print(n.key+" "); // display root node
            preoderTraversal(n.left);    // recoursive call to left
            preoderTraversal(n.right);   // recoursive call to right
        }
    }

    // postoder traversal
    void postoderTraversal(Node n){  // we pass root node of every binary tree i.e it is a recursive call
        if(n!= null){               // condition chek till we reach the end of leaf node
            preoderTraversal(n.left);    // recoursive call to left
            preoderTraversal(n.right);   // recoursive call to right
            System.out.print(n.key+" "); // display root node
        }
    }

    // inoder traversal
    void inoderTraversal(Node n){  // we pass root node of every binary tree i.e it is a recursive call
        if(n!= null){               // condition chek till we reach the end of leaf node
            preoderTraversal(n.left);    // recoursive call to left
            System.out.print(n.key+" "); // display root node
            preoderTraversal(n.right);   // recoursive call to right
        }
    }
   
}

public class binary_tree_implementation {
    public static void main(String[] args) {
        TreeTraversal t1 = new TreeTraversal();  // creating tree using object of class treetraversal
        t1.root = new Node('A');                 // root child
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');
        
        t1.preoderTraversal(t1.root);  // calling preodertraversal
        System.out.println();
        t1.postoderTraversal(t1.root);
        System.out.println();
        t1.inoderTraversal(t1.root);       
    }
}
