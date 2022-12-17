/*-------------------------------QUEUE USING ARRAY------------------------------*/

class Queue {

    int top;
    int size = 5;
    int[] arr=new int[size];
    
    
    
    
    // Traversal:
    
    void Traversal(){
        {
    
            if ( top == -1)
            {
               System.out.println("Queue is Empty !!"); 
                    }
            
           else
            {
              for (int i =0; i <= top; i++)
              {
               System.out.print(arr[i]+" "); 
              }
              
            }
          }
        
    }
    
    /***************************************************/
    
    
    // IsEmpty Function:
    
    boolean IsEmpty(){
    if(top==-1){
    
        return true;
    
    }
    
    else{
    
        return false;
    }
    
    }
    
    /****************************************************/
    
    
    // IsFull Function:
    
    boolean IsFull(){
        if(top== size-1){
        
            return true;
        
        }
        
        else{
        
            return false;
        }
        
        }
        
        /****************************************************/
    
    
    // Enqueue Function
    
    void EnQueue(int data){
        if (IsFull())
        {
           System.out.println("Queue is full");
        }
        else{
        
          top++;
         arr[top]=data;
          
        System.out.println("Element Inserted!!");
        
        }
    
    }
    
    /****************************************************/
    
    // DeQueue Function
    
    void  DeQueue(){
        if (IsEmpty())
        {
           System.out.println("Queue is empty");
        }
        else{
            int data = arr[0];
            top--;  

            for(int i =0; i<=top;i++){
                arr[i] =arr[i+1];


            }    
        System.out.println(data+" Removed!!");
        
        }
    
    }
    
    /****************************************************/
    
    // Peek Function
    
    void peek(int data){
    
        int a=0;
        if (IsEmpty())
        {
           System.out.println("Queue is empty");
        }
        else
            {
              for (int i =0; i <=top; i++)
              {
                if(data==arr[i]){
                    System.out.println(data+" found at index = "+(i+1));
                    a++;
                    break;
                }
         
              }
              
            }
     if(a==0){
    
        System.out.println(data+" not found!!");
     }
    }
    
    /****************************************************/
        
        
    }
    
    
    
    
    public class QueueDsUsingArray {
    
        public static void main(String[] Arge) {
    
    
            Queue Q = new Queue();
    
            Q.top = -1;
           
    
            // Pushing element manualy 
    
            Q.arr[0] = 11;
            Q.top++;
            Q.arr[1] = 22;
            Q.top++;
            Q.arr[2] = 33;
            Q.top++;
            Q.arr[3] = 44;
            Q.top++;
         

            // Inserting:
            
            // Q.EnQueue(15);
            
            // Removing:

            // Q.DeQueue();
            
            // Peeking:

            // Q.peek(33);
            
            // Traversal
            
            // Q.Traversal();
          
        
    }
    }
