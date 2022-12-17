/*-------------------------------STACK USING ARRAY------------------------------*/

class stk {

int top;
int size = 5;
int[] arr=new int[size];




// Traversal:

void Traversal(){
    {

        if ( top == -1)
        {
           System.out.println("Stack is Empty !!"); 
                }
        
       else
        {
          for (int i =top; i >= 0; i--)
          {
           System.out.println(arr[i]); 
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


// Push Function

void push(int data){
    if (IsFull())
    {
       System.out.println("Stack is full");
    }
    else{
    
      top++;
     arr[top]=data;
      
    System.out.println("Element pushed!!");
    
    }

}

/****************************************************/

// Pop Function

void pop(){
    if (IsEmpty())
    {
       System.out.println("Stack is empty");
    }
    else{
        int data = arr[top];
      top--;      
    System.out.println(data+" Removed!!");
    
    }

}

/****************************************************/

// Peek Function

void peek(int data){

    int a=0;
    if (IsEmpty())
    {
       System.out.println("Stack is empty");
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




public class StackDSUsingArray {

    public static void main(String[] Arge) {


        stk stack = new stk();

        stack.top = -1;
       

        // Pushing element manualy 

        stack.arr[0] = 11;
        stack.top++;
        stack.arr[1] = 22;
        stack.top++;
        stack.arr[2] = 33;
        stack.top++;
        stack.arr[3] = 44;
        stack.top++;
        
         
       // stack.push(55);

       // stack.pop();

       // stack.peek(2);

       // stack.Traversal();
    
}
}