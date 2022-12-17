/*---------------------------------------LINKED LIST---------------------------------------------------------*/

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;

    }

}


class LL{

    public Node head;
   

// isEmpty Function:

    public boolean isEmpty() {
        return head == null;
    }
/*********************************************/ 


// Traversal:

    public void Traversal() {

        while (head != null) {

            System.out.println(head.data);
            head = head.next;

        }

    }
/*********************************************/ 


// Add At First Index:

public void AddFirst(int data01) {

    if(isEmpty()){

        Node NewNode = new Node(data01);
        head = NewNode;
        return;

    }
    else {
        Node SecondNode = new Node(data01);
        SecondNode.next = head;
        head = SecondNode;

    }

    }


/*********************************************/ 


// Add At Last Index:

public void AddLast(int data01) {

    while (head.next != null) {

        
        head = head.next;

    }

    Node NewNode = new Node(data01);
    head.next = NewNode;
    NewNode.next = null;

}
/*********************************************/ 






// Remove At First Index:

public void RemoveFirst() {

    if(isEmpty()){

       System.out.println("List is empty!");

    }
    else {
        
        head = head.next;

    }

    }


/*********************************************/ 


// Remove At Last Index:

public void RemoveLast() {

    Node p =  head;
    Node q = p.next;

    while (q.next != null) {

        p= p.next;
        q= q.next;
       

    }
    p.next = null;
    

}
/*********************************************/ 

}




public class LinkedListDS {

    public static void main(String[] Arge) {
      
  LL list = new LL();

  // Add First:

  list.AddFirst(50);
  list.AddFirst(40);
  list.AddFirst(30);
  list.AddFirst(20);
  list.AddFirst(10);
  
  // Add Last:

  // list.AddLast(60);
   //list.AddLast(70);


  //  Remove First:

  // list.RemoveFirst();

  // Remove Last:

  // list.RemoveLast();

  list.Traversal();


    }    
}
