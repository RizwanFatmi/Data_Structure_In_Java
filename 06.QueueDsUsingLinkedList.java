
/*-----------------------------------QUEUE USING LIKED LIST--------------------------------------*/

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;

    }

}

class Queue {

    public Node head;
    int top;

    // isEmpty Function:
    public boolean isEmpty() {
        return head == null;
    }

    // EnQueue Function:

    public void EnQueue(int data) {

        Node NewNode = new Node(data);
        if (isEmpty()) {
            head = NewNode;
            top = 1;
            return;
        }
        else{
            while (head.next != null) {

        
                head = head.next;
        
            }
        
           
            head.next = NewNode;
            NewNode.next = null;
        }

    

    }

    // DeQueue Function:
    public void DeQueue() {
        if(isEmpty()){

            System.out.println("Queue is empty!");
     
         }
         else {
             
             head = head.next;
     
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

            System.out.print(head.data +" ");
            head = head.next;

        }

    }

}


public class QueueDsUsingLinkedList {

    public static void main(String[] Arge) {

        Queue Q = new Queue();

        // Add Element:

         Q.EnQueue(55);
         Q.EnQueue(25);
        
        // Remove Element

        // Q.DeQueue();
       
        // Peeking Element:

        // Q.peek(2);

        // Traversal:

        // Q.Traversal();

        

       

    }
}
