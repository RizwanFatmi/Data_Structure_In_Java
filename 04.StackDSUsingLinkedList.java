/*-----------------------------------STACK USING LIKED LIST--------------------------------------*/

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;

    }

}

class stk {

    public Node head;
    int top;

    // isEmpty Function:
    public boolean isEmpty() {
        return head == null;
    }

    // Push Function:
    public void push(int data) {

        Node NewNode = new Node(data);
        if (isEmpty()) {
            head = NewNode;
            top = 1;
            return;
        }

        NewNode.next = head;
        head = NewNode;
        top++;

    }

    // Pop Function:
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!!");
        } else {

            int RemovedData = head.data;
            head = head.next;
            System.out.println(RemovedData + " is removed!!");
            top--;
        }

    }

    // Peek Function:
    public void peek(int index) {
        int a = 0;

        while (head != null) {

            if (a == index - 1) {
                System.out.println(head.data);

            }
            head = head.next;

            a++;

        }
    }

    // Traversal:

    public void Traversal() {

        while (head != null) {

            System.out.println(head.data);
            head = head.next;

        }

    }

}

class StackDSUsingLinkedList {

    public static void main(String[] Arge) {

        stk stack = new stk();

        stack.push(55);
        stack.push(3);
        stack.push(44);
        stack.push(70);
        stack.push(15);

        // stack.pop();
        // stack.push(100);
        // stack.peek(5);

        stack.Traversal();

    }
}
