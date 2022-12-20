/*------------------------------BINARY TREE--------------------------------------*/


class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }


// Traversal Functions:

void PreOrder(Node root){
    
if(root!=null){

    System.out.print(root.data+" ");
    PreOrder(root.left);
    PreOrder(root.right);
}
}

void PostOrder(Node root){

    if(root!=null){

        
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
}

void InOrder(Node root){
    
    if(root!=null){

        
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
        
    }
}



// Searching Function:

void Search(Node root, int data)
{
    
    if(root!=null){

    if(root.data == data){

    System.out.println(data+" found.");
    }

    Search(root.left,data);
    Search(root.right,data);
    }
}
}

class BinaryTree{
public static void main(String[] Arge) {


// Creating Nodes:

Node n1 = new Node(3);
Node n2 = new Node(5);
Node n3 = new Node(6);
Node n4 = new Node(9);
Node n5 = new Node(8);


// Creting Tree :

n1.left = n2;
n1.right = n4;

n2.left = n3;
n2.right = null;


n3.left = null;
n3.right = null;


n4.left = n5;
n4.right = null;


n5.left = null;
n5.right = null;

Node root = n1;


n1.PreOrder(root);
System.out.println();
n1.PostOrder(root);
System.out.println();
n1.InOrder(root);
System.out.println();

n1.Search(root, 5);


}
}