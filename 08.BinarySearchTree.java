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

    void PreOrder(Node root) {

        if (root != null) {

            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    void PostOrder(Node root) {

        if (root != null) {

            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    void InOrder(Node root) {

        if (root != null) {

            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);

        }
    }

    // Searching Function:

    void Search(Node root, int data) {

        if (root != null) {

            if (root.data == data) {

                System.out.println(data + " found.");
            }

            Search(root.left, data);
            Search(root.right, data);
        }
    }

    // Insertion Function:

    void Insert(Node root, int data) {
        Node prev = null;

        while (root != null) {

            prev = root;

            if (root.data == data) {
                System.out.println(data + " is alredy available in tree.");

                return;
            }

            else if (root.data > data) {

                root = root.left;
            }

            else {
                root = root.right;
            }
        }
        Node newnode = new Node(data);

        if (data < prev.data) {

            prev.left = newnode;
        }

        else {

            prev.right = newnode;
        }
    }

    /******************************************************/

    // FUNCTION FOR DELETION :

    Node deleteRec(Node root, int data) {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);

        // if key is same as root's
        // key, then This is the
        // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    /******************************************************/

}

public class BinarySearchTree {
    public static void main(String[] Arge) {

        // Creating Nodes:

        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(9);
        Node n5 = new Node(7);

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

        n1.Insert(root, 4);
        n1.deleteRec(root, 4);
        n1.PreOrder(root);
        System.out.println();
        n1.PostOrder(root);
        System.out.println();
        n1.InOrder(root);
        System.out.println();

        n1.Search(root, 5);

    }
}
